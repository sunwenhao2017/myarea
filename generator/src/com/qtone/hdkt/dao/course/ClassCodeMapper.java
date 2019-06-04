package com.qtone.hdkt.dao.course;

import com.qtone.hdkt.model.course.ClassCode;
import com.qtone.hdkt.model.course.ClassCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassCodeMapper {
    int countByExample(ClassCodeExample example);

    int deleteByExample(ClassCodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClassCode record);

    int insertSelective(ClassCode record);

    List<ClassCode> selectByExample(ClassCodeExample example);

    ClassCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClassCode record, @Param("example") ClassCodeExample example);

    int updateByExample(@Param("record") ClassCode record, @Param("example") ClassCodeExample example);

    int updateByPrimaryKeySelective(ClassCode record);

    int updateByPrimaryKey(ClassCode record);
}