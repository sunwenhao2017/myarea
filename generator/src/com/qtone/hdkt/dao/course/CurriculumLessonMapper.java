package com.qtone.hdkt.dao.course;

import com.qtone.hdkt.model.course.CurriculumLesson;
import com.qtone.hdkt.model.course.CurriculumLessonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CurriculumLessonMapper {
    int countByExample(CurriculumLessonExample example);

    int deleteByExample(CurriculumLessonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CurriculumLesson record);

    int insertSelective(CurriculumLesson record);

    List<CurriculumLesson> selectByExample(CurriculumLessonExample example);

    CurriculumLesson selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CurriculumLesson record, @Param("example") CurriculumLessonExample example);

    int updateByExample(@Param("record") CurriculumLesson record, @Param("example") CurriculumLessonExample example);

    int updateByPrimaryKeySelective(CurriculumLesson record);

    int updateByPrimaryKey(CurriculumLesson record);
}