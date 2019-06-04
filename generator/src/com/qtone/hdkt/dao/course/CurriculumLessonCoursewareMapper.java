package com.qtone.hdkt.dao.course;

import com.qtone.hdkt.model.course.CurriculumLessonCourseware;
import com.qtone.hdkt.model.course.CurriculumLessonCoursewareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CurriculumLessonCoursewareMapper {
    int countByExample(CurriculumLessonCoursewareExample example);

    int deleteByExample(CurriculumLessonCoursewareExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CurriculumLessonCourseware record);

    int insertSelective(CurriculumLessonCourseware record);

    List<CurriculumLessonCourseware> selectByExample(CurriculumLessonCoursewareExample example);

    CurriculumLessonCourseware selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CurriculumLessonCourseware record, @Param("example") CurriculumLessonCoursewareExample example);

    int updateByExample(@Param("record") CurriculumLessonCourseware record, @Param("example") CurriculumLessonCoursewareExample example);

    int updateByPrimaryKeySelective(CurriculumLessonCourseware record);

    int updateByPrimaryKey(CurriculumLessonCourseware record);
}