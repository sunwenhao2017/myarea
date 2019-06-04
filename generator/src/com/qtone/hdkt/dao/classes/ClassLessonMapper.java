package com.qtone.hdkt.dao.classes;

import com.qtone.hdkt.model.classes.ClassLesson;
import com.qtone.hdkt.model.classes.ClassLessonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassLessonMapper {
    int countByExample(ClassLessonExample example);

    int deleteByExample(ClassLessonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClassLesson record);

    int insertSelective(ClassLesson record);

    List<ClassLesson> selectByExample(ClassLessonExample example);

    ClassLesson selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClassLesson record, @Param("example") ClassLessonExample example);

    int updateByExample(@Param("record") ClassLesson record, @Param("example") ClassLessonExample example);

    int updateByPrimaryKeySelective(ClassLesson record);

    int updateByPrimaryKey(ClassLesson record);
}