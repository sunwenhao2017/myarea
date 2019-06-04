package com.qtone.hdkt.dao.dict;

import com.qtone.hdkt.model.dict.DictOrganizationTerm;
import com.qtone.hdkt.model.dict.DictOrganizationTermExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictOrganizationTermMapper {
    int countByExample(DictOrganizationTermExample example);

    int deleteByExample(DictOrganizationTermExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DictOrganizationTerm record);

    int insertSelective(DictOrganizationTerm record);

    List<DictOrganizationTerm> selectByExample(DictOrganizationTermExample example);

    DictOrganizationTerm selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DictOrganizationTerm record, @Param("example") DictOrganizationTermExample example);

    int updateByExample(@Param("record") DictOrganizationTerm record, @Param("example") DictOrganizationTermExample example);

    int updateByPrimaryKeySelective(DictOrganizationTerm record);

    int updateByPrimaryKey(DictOrganizationTerm record);
}