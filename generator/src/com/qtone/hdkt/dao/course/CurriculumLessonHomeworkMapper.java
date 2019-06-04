package com.qtone.hdkt.dao.course;

import com.qtone.hdkt.model.course.CurriculumLessonHomework;
import com.qtone.hdkt.model.course.CurriculumLessonHomeworkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CurriculumLessonHomeworkMapper {
    int countByExample(CurriculumLessonHomeworkExample example);

    int deleteByExample(CurriculumLessonHomeworkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CurriculumLessonHomework record);

    int insertSelective(CurriculumLessonHomework record);

    List<CurriculumLessonHomework> selectByExample(CurriculumLessonHomeworkExample example);

    CurriculumLessonHomework selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CurriculumLessonHomework record, @Param("example") CurriculumLessonHomeworkExample example);

    int updateByExample(@Param("record") CurriculumLessonHomework record, @Param("example") CurriculumLessonHomeworkExample example);

    int updateByPrimaryKeySelective(CurriculumLessonHomework record);

    int updateByPrimaryKey(CurriculumLessonHomework record);
}