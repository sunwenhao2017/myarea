package ${options.itns};

import ${options.pons}.${model.upperCaseName};

import com.baomidou.mybatisplus.service.IService;
import com.baomidou.mybatisplus.plugins.Page;

import java.util.List;

/**
 * @Description: ${model.upperCaseName}服务层
 * @author: powerbridge@powerbridge.com
 * @Date: ${model.curTime}
 */
public interface I${model.upperCaseName}Service extends IService<${model.upperCaseName}> {

    /**
     * 分页查询
     *
     * @param page 分页
     * @param ${model.simpleName}
     * @return Page<${model.upperCaseName}>
     */
    Page<${model.upperCaseName}> select${model.upperCaseName}List(Page<${model.upperCaseName}> page, ${model.upperCaseName} ${model.simpleName});

    /**
     * 批量删除
     * @param seqNoByList 主键集合
     * @return
     */
    boolean deleteBySeqNoList(List<String> seqNoByList);

    /**
     * 根据单据编号 判断单据是否存在
     * @param seqNo
     * @return
     */
    boolean isExistBsc(String seqNo);
}