package com.qtone.hdkt.dao.course;

import com.qtone.hdkt.model.course.CurriculumLessonStorybook;
import com.qtone.hdkt.model.course.CurriculumLessonStorybookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CurriculumLessonStorybookMapper {
    int countByExample(CurriculumLessonStorybookExample example);

    int deleteByExample(CurriculumLessonStorybookExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CurriculumLessonStorybook record);

    int insertSelective(CurriculumLessonStorybook record);

    List<CurriculumLessonStorybook> selectByExample(CurriculumLessonStorybookExample example);

    CurriculumLessonStorybook selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CurriculumLessonStorybook record, @Param("example") CurriculumLessonStorybookExample example);

    int updateByExample(@Param("record") CurriculumLessonStorybook record, @Param("example") CurriculumLessonStorybookExample example);

    int updateByPrimaryKeySelective(CurriculumLessonStorybook record);

    int updateByPrimaryKey(CurriculumLessonStorybook record);
}