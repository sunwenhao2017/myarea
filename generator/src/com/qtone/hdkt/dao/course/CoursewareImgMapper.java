package com.qtone.hdkt.dao.course;

import com.qtone.hdkt.model.course.CoursewareImg;
import com.qtone.hdkt.model.course.CoursewareImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoursewareImgMapper {
    int countByExample(CoursewareImgExample example);

    int deleteByExample(CoursewareImgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoursewareImg record);

    int insertSelective(CoursewareImg record);

    List<CoursewareImg> selectByExample(CoursewareImgExample example);

    CoursewareImg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoursewareImg record, @Param("example") CoursewareImgExample example);

    int updateByExample(@Param("record") CoursewareImg record, @Param("example") CoursewareImgExample example);

    int updateByPrimaryKeySelective(CoursewareImg record);

    int updateByPrimaryKey(CoursewareImg record);
}