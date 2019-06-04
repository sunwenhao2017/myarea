package com.qtone.hdkt.dao.dict;

import com.qtone.hdkt.model.dict.DictOrganizationSubject;
import com.qtone.hdkt.model.dict.DictOrganizationSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictOrganizationSubjectMapper {
    int countByExample(DictOrganizationSubjectExample example);

    int deleteByExample(DictOrganizationSubjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DictOrganizationSubject record);

    int insertSelective(DictOrganizationSubject record);

    List<DictOrganizationSubject> selectByExample(DictOrganizationSubjectExample example);

    DictOrganizationSubject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DictOrganizationSubject record, @Param("example") DictOrganizationSubjectExample example);

    int updateByExample(@Param("record") DictOrganizationSubject record, @Param("example") DictOrganizationSubjectExample example);

    int updateByPrimaryKeySelective(DictOrganizationSubject record);

    int updateByPrimaryKey(DictOrganizationSubject record);
}