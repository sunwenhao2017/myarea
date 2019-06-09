package ${options.mpns};

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;

import java.util.List;
import ${options.pons}.${model.upperCaseName};

/**
 * @Description: ${model.upperCaseName}持久层
 * @author: powerbridge@powerbridge.com
 * @Date: ${model.curTime}
 */
public interface ${model.upperCaseName}Mapper extends BaseMapper<${model.upperCaseName}> {

    /**
     * 分页查询
     *
     * @param page 分页
     * @param ${model.simpleName}
     * @return Page<${model.upperCaseName}>
     */
    List<${model.upperCaseName}> select${model.upperCaseName}List(Page<${model.upperCaseName}> page, ${model.upperCaseName} ${model.simpleName});

}