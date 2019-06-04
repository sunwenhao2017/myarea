package com.qtone.hdkt.dao.lesson;

import com.qtone.hdkt.model.lesson.LessonClasstestProblemAnswer;
import com.qtone.hdkt.model.lesson.LessonClasstestProblemAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LessonClasstestProblemAnswerMapper {
    int countByExample(LessonClasstestProblemAnswerExample example);

    int deleteByExample(LessonClasstestProblemAnswerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LessonClasstestProblemAnswer record);

    int insertSelective(LessonClasstestProblemAnswer record);

    List<LessonClasstestProblemAnswer> selectByExampleWithBLOBs(LessonClasstestProblemAnswerExample example);

    List<LessonClasstestProblemAnswer> selectByExample(LessonClasstestProblemAnswerExample example);

    LessonClasstestProblemAnswer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LessonClasstestProblemAnswer record, @Param("example") LessonClasstestProblemAnswerExample example);

    int updateByExampleWithBLOBs(@Param("record") LessonClasstestProblemAnswer record, @Param("example") LessonClasstestProblemAnswerExample example);

    int updateByExample(@Param("record") LessonClasstestProblemAnswer record, @Param("example") LessonClasstestProblemAnswerExample example);

    int updateByPrimaryKeySelective(LessonClasstestProblemAnswer record);

    int updateByPrimaryKeyWithBLOBs(LessonClasstestProblemAnswer record);

    int updateByPrimaryKey(LessonClasstestProblemAnswer record);
}