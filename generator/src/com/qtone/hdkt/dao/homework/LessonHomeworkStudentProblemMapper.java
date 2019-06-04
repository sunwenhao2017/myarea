package com.qtone.hdkt.dao.homework;

import com.qtone.hdkt.model.homework.LessonHomeworkStudentProblem;
import com.qtone.hdkt.model.homework.LessonHomeworkStudentProblemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LessonHomeworkStudentProblemMapper {
    int countByExample(LessonHomeworkStudentProblemExample example);

    int deleteByExample(LessonHomeworkStudentProblemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LessonHomeworkStudentProblem record);

    int insertSelective(LessonHomeworkStudentProblem record);

    List<LessonHomeworkStudentProblem> selectByExampleWithBLOBs(LessonHomeworkStudentProblemExample example);

    List<LessonHomeworkStudentProblem> selectByExample(LessonHomeworkStudentProblemExample example);

    LessonHomeworkStudentProblem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LessonHomeworkStudentProblem record, @Param("example") LessonHomeworkStudentProblemExample example);

    int updateByExampleWithBLOBs(@Param("record") LessonHomeworkStudentProblem record, @Param("example") LessonHomeworkStudentProblemExample example);

    int updateByExample(@Param("record") LessonHomeworkStudentProblem record, @Param("example") LessonHomeworkStudentProblemExample example);

    int updateByPrimaryKeySelective(LessonHomeworkStudentProblem record);

    int updateByPrimaryKeyWithBLOBs(LessonHomeworkStudentProblem record);

    int updateByPrimaryKey(LessonHomeworkStudentProblem record);
}