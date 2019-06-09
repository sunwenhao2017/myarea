package com.powerbridge.codegen.core;

import com.google.common.base.Strings;
import com.powerbridge.codegen.config.*;
import com.powerbridge.codegen.serivce.IModelBuilder;
import com.powerbridge.codegen.service.impl.JsonModelBuilder;
import com.powerbridge.codegen.service.impl.MySqlModelBuilder;
import com.powerbridge.codegen.util.ClassBuilder;
import com.powerbridge.codegen.util.ConfigReader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Description: 
 * @author: shunhe@powerbridge.com
 * @Date: 2018年7月24日上午9:00:00
 */
@Component
public class Codegenerator {

	@Autowired
	private CodegenConfig config;
	@Resource
	private Configuration cfg;
	
    private String templatePath;
	private HashMap<String, List<Object>> dataModels = new HashMap<>();
    private HashMap<String, ModelBuilderConfig> modelBuilderConfigs = new HashMap<>();
	
	public void Start(Model model, HttpServletRequest request) throws Exception {
		this.templatePath = StringUtils.isEmpty(templatePath) ? "classpath:templates" : templatePath;
		for (ModelBuilderConfig modelBuilderConfig : config.getModelbuilders()) {
            modelBuilderConfigs.put(modelBuilderConfig.getName(), modelBuilderConfig);
        }
		List<TemplateConfig> templates = config.getTemplates();
        for (TemplateConfig template : templates) {
        	model.addAttribute("options",template.getOptions());
        	String moderBuilderName = template.getModelBuilderName();
            if (!modelBuilderConfigs.containsKey(moderBuilderName)) {
                throw new Exception("template's datasourceclassname not be defined");
            }
            List<Object> models;
            if (dataModels.containsKey(moderBuilderName)) {
                models = dataModels.get(moderBuilderName);
            } else {
                ModelBuilderConfig modelBuilderConfig = modelBuilderConfigs.get(moderBuilderName);
                String builderType = modelBuilderConfig.getType();
                IModelBuilder ds;
                Class<?> type;
                switch (builderType) {
                    case "mysql":
                        type = MySqlConfig.class;
                        ds = new MySqlModelBuilder();
                        break;
                    case "json":
                        type = ArrayList.class;
                        ds = new JsonModelBuilder();
                        break;	
                    case "custom":
                        String modelBuilderClassName = modelBuilderConfig.getModelBuilderClassName();
                        ds = ClassBuilder.newInstance(modelBuilderClassName);
                        type = ClassBuilder.getGenericTypeArgumengt(modelBuilderClassName);
                        break;
                    default:
                        throw new Exception("modelBuilderConfig missing type...");
                }

                //models = ds.buildDataModels(ConfigReader.getConfigByFilePath(type, modelBuilderConfig.getConfigPath()));
                models = ds.buildDataModels(ConfigReader.getConfigByRequest(type, request));
                dataModels.put(moderBuilderName, models);
            }
            cfg.setDirectoryForTemplateLoading(ResourceUtils.getFile(templatePath));
            cfg.setDefaultEncoding("UTF-8");
            cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

            if (template.isOneFile()) {
                ProcessTemplate(models, template);
            } else {
                for (Object eachModel : models) {
                    ProcessTemplate(eachModel, template);
                }
            }
        }
	}
	
	private void ProcessTemplate(Object dataModel, TemplateConfig template) throws Exception {
        ModelHolder modelHolder = new ModelHolder(dataModel, template.getOptions());
        String tempFilename = template.getTemplateFilename();
        String outputPath = template.getOutputPath();
        String outputFilenameRule = template.getOutputFilenameRule();
        String filename;
        if (template.isOneFile()) {
            filename = outputFilenameRule;
        }
        else {
            int startIndex = outputFilenameRule.indexOf("{") + 1;
            int endIndex = outputFilenameRule.indexOf("}");

            if (startIndex >= endIndex) {
                throw new StringIndexOutOfBoundsException(endIndex - startIndex);
            }
            String propName = outputFilenameRule.substring(startIndex, endIndex);
            String filenameValue;
            if (dataModel instanceof HashMap) {
                filenameValue = (String) ((HashMap) dataModel).get(propName);
            } else {
                filenameValue = (String) FieldUtils.readField(dataModel, propName, true);
            }
            filename = outputFilenameRule.replace("{" + propName + "}", filenameValue).replace("$", "");
        }
        //outputPath = outputPath.endsWith("/") ? outputPath : outputPath + "/";
        //加判断，自适应是否新增子模块层级
        boolean addModelStructure = Strings.isNullOrEmpty(config.getModelName()) ? false : true;
        if(addModelStructure){
            if(outputPath.endsWith("controller") ||
                    outputPath.endsWith("dao") ||
                    outputPath.endsWith("entity") ||
                    outputPath.endsWith("service") ||
                    outputPath.endsWith("mapper")
                    ) {
                outputPath = outputPath + "/" + config.getModelName();
            }
            if(outputPath.endsWith("service/impl"))
                outputPath = outputPath.substring(0, outputPath.lastIndexOf("/")) + "/" + config.getModelName() + "/impl";
        }

        filename = outputPath + "/" + filename;

        File outPath = new File(outputPath);
        outPath.mkdirs();
        Template temp = cfg.getTemplate(tempFilename);
        FileWriter writer = new FileWriter(new File(filename));
        temp.process(modelHolder, writer);
        writer.close();
    }
}

