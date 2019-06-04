package com.qtone.hdkt.dao.school;

import com.qtone.hdkt.model.school.School;
import com.qtone.hdkt.model.school.SchoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchoolMapper {
    int countByExample(SchoolExample example);

    int deleteByExample(SchoolExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(School record);

    int insertSelective(School record);

    List<School> selectByExample(SchoolExample example);

    School selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") School record, @Param("example") SchoolExample example);

    int updateByExample(@Param("record") School record, @Param("example") SchoolExample example);

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKey(School record);
}