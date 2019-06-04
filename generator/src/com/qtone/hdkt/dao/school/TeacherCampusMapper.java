package com.qtone.hdkt.dao.school;

import com.qtone.hdkt.model.school.TeacherCampus;
import com.qtone.hdkt.model.school.TeacherCampusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherCampusMapper {
    int countByExample(TeacherCampusExample example);

    int deleteByExample(TeacherCampusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TeacherCampus record);

    int insertSelective(TeacherCampus record);

    List<TeacherCampus> selectByExample(TeacherCampusExample example);

    TeacherCampus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TeacherCampus record, @Param("example") TeacherCampusExample example);

    int updateByExample(@Param("record") TeacherCampus record, @Param("example") TeacherCampusExample example);

    int updateByPrimaryKeySelective(TeacherCampus record);

    int updateByPrimaryKey(TeacherCampus record);
}