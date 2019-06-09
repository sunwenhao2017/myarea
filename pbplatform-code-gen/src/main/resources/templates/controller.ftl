package ${options.conns};

import com.powerbridge.core.controller.BaseController;
import com.powerbridge.core.constants.MessageConstants;
import com.powerbridge.core.util.UUIDGenerator;
import com.powerbridge.core.util.UniteVerifyUtils;
import com.powerbridge.core.dto.AjaxResult;
import com.powerbridge.core.util.toolbox.StringUtil;
import com.powerbridge.core.aspect.RepeatSubmitValidation;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import lombok.extern.slf4j.Slf4j;

import ${options.pons}.${model.upperCaseName};
import ${options.itns}.I${model.upperCaseName}Service;

import java.util.Arrays;

/**
 * @Description: ${model.upperCaseName}控制层
 * 注意：该类通过平台代码自动生成，有些地方如：字段处理因通用性问题有缺失，请根据实际情况增加
 * @author: powerbridge@powerbridge.com
 * @Date: ${model.curTime}
 */
@Slf4j
@RequestMapping("/${model.humpName}")
@RestController
@Api(description="${model.remarks} 操作接口", tags= {"${model.upperCaseName}Controller"})
public class ${model.upperCaseName}Controller extends BaseController<I${model.upperCaseName}Service, ${model.upperCaseName}> {

    @Autowired
    private I${model.upperCaseName}Service ${model.humpName}Service;

    /**
    * 指定对象的后台校验规则
    *
    * @param ${model.humpName}
    * @return
    */
    @GetMapping("/uniteVerifyRule")
    @ApiOperation(value="获取指定对象的后台校验规则")
    @ApiResponses({
        @ApiResponse(response=${model.upperCaseName}.class, code = 1, message = "ok")
    })
    public AjaxResult uniteVerifyRule(@RequestBody ${model.upperCaseName} ${model.humpName}) {
        AjaxResult ajaxResult = null;
        try {
            UniteVerifyUtils u = new UniteVerifyUtils();
            ajaxResult = json(MessageConstants.PB_STATUS_SUCCESS, u.generate(${model.humpName}));
        } catch (Exception e) {
            e.printStackTrace();
            ajaxResult = result(MessageConstants.PB_STATUS_FAIL);
            log.error("uniteVerifyRule()--err", e);
        }
        return ajaxResult;
    }

    /**
     * 新增
     *
     * @param ${model.humpName}
     * @return
     */
    @RepeatSubmitValidation
    @PostMapping("/list/add")
    @ApiOperation(value="新增${model.remarks}")
    @ApiResponses({
        @ApiResponse(response=Boolean.class, code = 1, message = "ok")
    })
    public AjaxResult add${model.upperCaseName}(@RequestBody ${model.upperCaseName} ${model.humpName}) {
        String oid = UUIDGenerator.getUUID();
        if (null == oid || "".equals(oid)) {
            return json(MessageConstants.PB_STATUS_FAIL, "id生成失败");
        }
        AjaxResult ajaxResult = null;
        try {
            <#list model.fields as field>
                <#if field.name == model.primaryKey.name>
                ${model.humpName}.set${field.getSetName}(oid);
                </#if>
            </#list>
            boolean flag = ${model.humpName}Service.insert(${model.humpName});
            if (flag) {
                ajaxResult = json(MessageConstants.PB_STATUS_SUCCESS, ${model.humpName});
            } else {
                ajaxResult = result(MessageConstants.PB_STATUS_FAIL);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ajaxResult = result(MessageConstants.PB_STATUS_FAIL);
            log.error("add${model.upperCaseName}()--err", e);
        }
        return ajaxResult;
    }

    /**
     * 根据id删除
     *
     * @param id oid主键
     * @return
     */
    @DeleteMapping("/list/{id}/delete")
    @ApiOperation(value="根据id删除${model.remarks}")
    @ApiResponses({
        @ApiResponse(response=Boolean.class, code = 1, message = "ok")
    })
    public AjaxResult delete${model.upperCaseName}ById(@ApiParam(value="id", name="id", required=true) @PathVariable String id) {
        try {
            ${model.upperCaseName} ${model.humpName} = ${model.humpName}Service.selectById(id);
            if (${model.humpName} == null) {
                return json(MessageConstants.PB_STATUS_FAIL, "该记录不存在");
            }

            //执行删除
            //TODO  如果有关联子表，请在先删除子表数据
            EntityWrapper entityWrapper = new EntityWrapper();
            //entityWrapper.eq("SEQ_NO", ${model.humpName}.getSeqNo());

            //再删除主表数据
            if (${model.humpName}Service.deleteById(id)) {
                return result(MessageConstants.PB_STATUS_SUCCESS);
            }
        } catch (Exception e) {
            log.error("delete${model.upperCaseName}ById()--err", e);
            return json(MessageConstants.PB_STATUS_FAIL, e.getMessage());
        }
        return result(MessageConstants.PB_STATUS_FAIL);
    }

    /**
     * 批量删除操作
     *
     * @param
     * @return AjaxResult
     */
    @DeleteMapping("/list/deleteByList")
    @ApiOperation(value="批量删除${model.remarks}")
    @ApiResponses({
        @ApiResponse(response=Boolean.class, code = 1, message = "ok")
    })
    public AjaxResult delete${model.upperCaseName}ByList(@ApiParam(value="idList", name="idList", required=true)  @RequestParam String idList) {
        AjaxResult ajaxResult = null;
        try {
            //获取前台传输的oid集合
            boolean flag = ${model.humpName}Service.deleteBySeqNoList(Arrays.asList(idList.split(",")));
            if (flag) {
                ajaxResult = result(MessageConstants.PB_STATUS_SUCCESS);
            } else {
                ajaxResult = result(MessageConstants.PB_STATUS_FAIL);
            }
        } catch (Exception e) {
            ajaxResult = result(MessageConstants.PB_STATUS_FAIL);
            log.error("delete${model.upperCaseName}ByList()--err", e);
        }
        return ajaxResult;
    }

    /**
     * 修改
     *
     * @param ${model.humpName} 详细信息
     * @return
     */
    @PutMapping("/list/update")
    @ApiOperation(value="修改${model.remarks}")
    @ApiResponses({
        @ApiResponse(response=Boolean.class, code = 1, message = "ok")
    })
    public AjaxResult update${model.upperCaseName}(@RequestBody ${model.upperCaseName} ${model.humpName}) {
        AjaxResult ajaxResult = null;
            try {
            <#list model.fields as field>
                <#if field.name == model.primaryKey.name>
                ${model.humpName}.set${field.getSetName}(${model.humpName}.get${field.getSetName}());
            if (StringUtil.isEmpty(${model.humpName}.get${field.getSetName}())) {
                </#if>
            </#list>
                return json(MessageConstants.PB_STATUS_CODE_NOTEXIST, "主键不能为空");
            }
            boolean flag = ${model.humpName}Service.updateById(${model.humpName});
            if (flag) {
                ajaxResult = json(MessageConstants.PB_STATUS_SUCCESS, ${model.humpName});
            } else {
                ajaxResult = result(MessageConstants.PB_STATUS_FAIL);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ajaxResult = result(MessageConstants.PB_STATUS_FAIL);
            log.error("update${model.upperCaseName}()--err", e);
        }
        return ajaxResult;
    }

    /**
     * 根据id查询信息
     *
     * @param id 主键id
     * @return
     */
    @GetMapping("/list/{id}/view")
    @ApiOperation(value="根据id查询${model.remarks}")
    @ApiResponses({
        @ApiResponse(response=${model.upperCaseName}.class, code = 1, message = "ok")
    })
    public AjaxResult select${model.upperCaseName}ById(@ApiParam(value="id", name="id", required=true) @PathVariable String id) {
        AjaxResult ajaxResult;
        try {
            ${model.upperCaseName} ${model.humpName} = ${model.humpName}Service.selectById(id);
            ajaxResult = json(MessageConstants.PB_STATUS_SUCCESS, ${model.humpName});
        } catch (Exception e) {
            ajaxResult = result(MessageConstants.PB_STATUS_FAIL);
            log.error("select${model.upperCaseName}ById()--err", e);
        }
        return ajaxResult;
    }

    /**
     * 分页查询
     *
     * @param ${model.humpName}
     * @return
     */
    @PostMapping("/list")
    @ApiOperation(value="分页查询${model.remarks}")
    @ApiResponses({
        @ApiResponse(response=${model.upperCaseName}.class, code = 1, message = "ok")
    })
    public AjaxResult select${model.upperCaseName}List(@RequestBody ${model.upperCaseName} ${model.humpName}) {
        //TODO 如要做非空检查，可在这里添加

        AjaxResult ajaxResult = null;
        try {
            Page page = getPage();  // 分页
            String sort = getParameter("sort");
            boolean sortOrder = getOrderSort(getParameter("sortOrder"));
            if (StringUtil.isNotEmpty(sort)) {
                page.setAsc(sortOrder);
                page.setOrderByField(sort);  // 排序
            } else {
                //默认按录入日期倒排序
                page.setAsc(false);
                page.setOrderByField("decTime");  // 排序
            }
            Page<${model.upperCaseName}> ${model.humpName}Page = ${model.humpName}Service.select${model.upperCaseName}List(page, ${model.humpName});
            ajaxResult = json(MessageConstants.PB_STATUS_SUCCESS, ${model.humpName}Page.getRecords(), page.getTotal());
        } catch (Exception e) {
            ajaxResult = result(MessageConstants.PB_STATUS_FAIL);
            log.error("select${model.upperCaseName}List()--error", e);
        }
        return ajaxResult;
    }

}