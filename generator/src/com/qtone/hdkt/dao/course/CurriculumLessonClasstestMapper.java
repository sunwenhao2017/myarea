package com.qtone.hdkt.dao.course;

import com.qtone.hdkt.model.course.CurriculumLessonClasstest;
import com.qtone.hdkt.model.course.CurriculumLessonClasstestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CurriculumLessonClasstestMapper {
    int countByExample(CurriculumLessonClasstestExample example);

    int deleteByExample(CurriculumLessonClasstestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CurriculumLessonClasstest record);

    int insertSelective(CurriculumLessonClasstest record);

    List<CurriculumLessonClasstest> selectByExample(CurriculumLessonClasstestExample example);

    CurriculumLessonClasstest selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CurriculumLessonClasstest record, @Param("example") CurriculumLessonClasstestExample example);

    int updateByExample(@Param("record") CurriculumLessonClasstest record, @Param("example") CurriculumLessonClasstestExample example);

    int updateByPrimaryKeySelective(CurriculumLessonClasstest record);

    int updateByPrimaryKey(CurriculumLessonClasstest record);
}