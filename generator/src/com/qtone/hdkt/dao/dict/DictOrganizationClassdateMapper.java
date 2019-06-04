package com.qtone.hdkt.dao.dict;

import com.qtone.hdkt.model.dict.DictOrganizationClassdate;
import com.qtone.hdkt.model.dict.DictOrganizationClassdateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictOrganizationClassdateMapper {
    int countByExample(DictOrganizationClassdateExample example);

    int deleteByExample(DictOrganizationClassdateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DictOrganizationClassdate record);

    int insertSelective(DictOrganizationClassdate record);

    List<DictOrganizationClassdate> selectByExample(DictOrganizationClassdateExample example);

    DictOrganizationClassdate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DictOrganizationClassdate record, @Param("example") DictOrganizationClassdateExample example);

    int updateByExample(@Param("record") DictOrganizationClassdate record, @Param("example") DictOrganizationClassdateExample example);

    int updateByPrimaryKeySelective(DictOrganizationClassdate record);

    int updateByPrimaryKey(DictOrganizationClassdate record);
}