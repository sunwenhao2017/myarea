package com.qtone.hdkt.dao.lesson;

import com.qtone.hdkt.model.lesson.ClasstestProblem;
import com.qtone.hdkt.model.lesson.ClasstestProblemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClasstestProblemMapper {
    int countByExample(ClasstestProblemExample example);

    int deleteByExample(ClasstestProblemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClasstestProblem record);

    int insertSelective(ClasstestProblem record);

    List<ClasstestProblem> selectByExample(ClasstestProblemExample example);

    ClasstestProblem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClasstestProblem record, @Param("example") ClasstestProblemExample example);

    int updateByExample(@Param("record") ClasstestProblem record, @Param("example") ClasstestProblemExample example);

    int updateByPrimaryKeySelective(ClasstestProblem record);

    int updateByPrimaryKey(ClasstestProblem record);
}