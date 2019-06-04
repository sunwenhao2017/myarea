package com.qtone.hdkt.dao.dict;

import com.qtone.hdkt.model.dict.DictGrade;
import com.qtone.hdkt.model.dict.DictGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictGradeMapper {
    int countByExample(DictGradeExample example);

    int deleteByExample(DictGradeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DictGrade record);

    int insertSelective(DictGrade record);

    List<DictGrade> selectByExample(DictGradeExample example);

    DictGrade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DictGrade record, @Param("example") DictGradeExample example);

    int updateByExample(@Param("record") DictGrade record, @Param("example") DictGradeExample example);

    int updateByPrimaryKeySelective(DictGrade record);

    int updateByPrimaryKey(DictGrade record);
}