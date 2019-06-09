package ${options.imns};

import ${options.pons}.${model.upperCaseName};
import ${options.mpns}.${model.upperCaseName}Mapper;
import ${options.itns}.I${model.upperCaseName}Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.transaction.annotation.Transactional;
import com.powerbridge.core.service.impl.BaseServiceImpl;
import java.util.List;

@Service
public class ${model.upperCaseName}ServiceImpl extends BaseServiceImpl<${model.upperCaseName}Mapper,${model.upperCaseName}> implements I${model.upperCaseName}Service{

    @Autowired
    private ${model.upperCaseName}Mapper ${model.lowerCaseName}Mapper;

    /**
     * 分页查询
     *
     * @param page 分页
     * @param ${model.simpleName}
     * @return Page<${model.upperCaseName}>
     */
    @Override
    public Page<${model.upperCaseName}> select${model.upperCaseName}List(Page<${model.upperCaseName}> page, ${model.upperCaseName} ${model.simpleName}) {
		return page.setRecords(${model.lowerCaseName}Mapper.select${model.upperCaseName}List(page, ${model.simpleName}));
	}

    /**
    * 批量删除
    * @param idList 主键集合
    * @return
    */
    @Transactional
    public boolean deleteBySeqNoList(List<String> idList){
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.in("oid",idList);

        //TODO 若有子表关联数据，先删除子表数据
        /*List<${model.upperCaseName}> ${model.lowerCaseName}List=${model.lowerCaseName}Mapper.selectList(entityWrapper);
        for (${model.upperCaseName} ${model.lowerCaseName}:${model.lowerCaseName}List) {
            //根据表头Id 查找SEQ_NO删除子表
            EntityWrapper delEntityWrapper=new EntityWrapper();
            delEntityWrapper.eq("SEQ_NO", ${model.lowerCaseName}.getSeqNo());

        }*/
        boolean flag = retBool(${model.lowerCaseName}Mapper.delete(entityWrapper));
        return flag;
    }

    /**
    * 根据单据编号 判断单据是否存在
    * @param seqNo
    * @return
    */
    public boolean isExistBsc(String seqNo){
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.eq("SEQ_NO",seqNo);
        int count = ${model.lowerCaseName}Mapper.selectCount(entityWrapper);
        if(count == 0)
            return false;
        return  true;
    }

}