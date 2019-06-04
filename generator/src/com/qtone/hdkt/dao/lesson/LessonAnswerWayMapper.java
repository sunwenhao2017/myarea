package com.qtone.hdkt.dao.lesson;

import com.qtone.hdkt.model.lesson.LessonAnswerWay;
import com.qtone.hdkt.model.lesson.LessonAnswerWayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LessonAnswerWayMapper {
    int countByExample(LessonAnswerWayExample example);

    int deleteByExample(LessonAnswerWayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LessonAnswerWay record);

    int insertSelective(LessonAnswerWay record);

    List<LessonAnswerWay> selectByExample(LessonAnswerWayExample example);

    LessonAnswerWay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LessonAnswerWay record, @Param("example") LessonAnswerWayExample example);

    int updateByExample(@Param("record") LessonAnswerWay record, @Param("example") LessonAnswerWayExample example);

    int updateByPrimaryKeySelective(LessonAnswerWay record);

    int updateByPrimaryKey(LessonAnswerWay record);
}