package com.qtone.hdkt.dao.school;

import com.qtone.hdkt.model.school.DictSchoolArea;
import com.qtone.hdkt.model.school.DictSchoolAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictSchoolAreaMapper {
    int countByExample(DictSchoolAreaExample example);

    int deleteByExample(DictSchoolAreaExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DictSchoolArea record);

    int insertSelective(DictSchoolArea record);

    List<DictSchoolArea> selectByExample(DictSchoolAreaExample example);

    DictSchoolArea selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DictSchoolArea record, @Param("example") DictSchoolAreaExample example);

    int updateByExample(@Param("record") DictSchoolArea record, @Param("example") DictSchoolAreaExample example);

    int updateByPrimaryKeySelective(DictSchoolArea record);

    int updateByPrimaryKey(DictSchoolArea record);
}