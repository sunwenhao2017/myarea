package com.qtone.hdkt.dao.lesson;

import com.qtone.hdkt.model.lesson.LessonPicture;
import com.qtone.hdkt.model.lesson.LessonPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LessonPictureMapper {
    int countByExample(LessonPictureExample example);

    int deleteByExample(LessonPictureExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LessonPicture record);

    int insertSelective(LessonPicture record);

    List<LessonPicture> selectByExample(LessonPictureExample example);

    LessonPicture selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LessonPicture record, @Param("example") LessonPictureExample example);

    int updateByExample(@Param("record") LessonPicture record, @Param("example") LessonPictureExample example);

    int updateByPrimaryKeySelective(LessonPicture record);

    int updateByPrimaryKey(LessonPicture record);
}