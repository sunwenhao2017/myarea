package com.qtone.hdkt.dao.project;

import com.qtone.hdkt.model.project.Inter;
import com.qtone.hdkt.model.project.InterExample;
import com.qtone.hdkt.model.project.InterWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InterMapper {
    int countByExample(InterExample example);

    int deleteByExample(InterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InterWithBLOBs record);

    int insertSelective(InterWithBLOBs record);

    List<InterWithBLOBs> selectByExampleWithBLOBs(InterExample example);

    List<Inter> selectByExample(InterExample example);

    InterWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InterWithBLOBs record, @Param("example") InterExample example);

    int updateByExampleWithBLOBs(@Param("record") InterWithBLOBs record, @Param("example") InterExample example);

    int updateByExample(@Param("record") Inter record, @Param("example") InterExample example);

    int updateByPrimaryKeySelective(InterWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(InterWithBLOBs record);

    int updateByPrimaryKey(Inter record);
}