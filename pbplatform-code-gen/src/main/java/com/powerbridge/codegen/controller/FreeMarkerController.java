package com.powerbridge.codegen.controller;

import com.powerbridge.codegen.config.CodegenConfig;
import com.powerbridge.codegen.core.Codegenerator;
import com.powerbridge.codegen.core.Projectgenerator;
import com.powerbridge.codegen.util.FileUtil;
import com.powerbridge.core.controller.BaseController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: 
 * @author: shunhe@powerbridge.com
 * @Date: 2018年7月25日下午4:03:15
 */
@Slf4j
@Controller
public class FreeMarkerController extends BaseController {
	
	@Autowired
	private Codegenerator cg;
	@Autowired
	private Projectgenerator pg;
	@Autowired
	private CodegenConfig config;

	@GetMapping
	@RequestMapping(value = "/genCode")
    public @ResponseBody String genCode(Model model) {
		String result = "";
		try {
			FileUtil fileUtil = new FileUtil(config);
			fileUtil.getExampleProjectFromFtp();

			if(config.isBuildStructure())
				pg.start();
			cg.Start(model, getRequest());

			fileUtil.rebuildStructure(config.getSaveDir() + ":/" + config.getProjectName(), config.getModelName());
			result = "code gen successed !";
		} catch (Exception e) {
			result = e.getMessage();
			log.error(e.getMessage(),e);
			e.printStackTrace();
		}
        return result;
    }

}

