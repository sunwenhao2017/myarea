package com.qtone.hdkt.dao.lesson;

import com.qtone.hdkt.model.lesson.LessonPraise;
import com.qtone.hdkt.model.lesson.LessonPraiseExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface LessonPraiseMapper {
    int countByExample(LessonPraiseExample example);

    int deleteByExample(LessonPraiseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LessonPraise record);

    int insertSelective(LessonPraise record);

    List<LessonPraise> selectByExample(LessonPraiseExample example);

    LessonPraise selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LessonPraise record, @Param("example") LessonPraiseExample example);

    int updateByExample(@Param("record") LessonPraise record, @Param("example") LessonPraiseExample example);

    int updateByPrimaryKeySelective(LessonPraise record);

    int updateByPrimaryKey(LessonPraise record);
    /**
     * 
     * @Title: saveTeacherPraise   
     * @Description: 保存学生的表扬数据
     * @param paramMap
     * @return: Integer    
     * @author: weili
     * @date: 2018年9月18日 下午6:15:55
     * @throws
     */
	Integer saveTeacherPraise(Map<String, Object> paramMap);
}