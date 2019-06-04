package com.qtone.hdkt.dao.paper;

import com.qtone.hdkt.model.paper.WrongProblem;
import com.qtone.hdkt.model.paper.WrongProblemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WrongProblemMapper {
    int countByExample(WrongProblemExample example);

    int deleteByExample(WrongProblemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WrongProblem record);

    int insertSelective(WrongProblem record);

    List<WrongProblem> selectByExample(WrongProblemExample example);

    WrongProblem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WrongProblem record, @Param("example") WrongProblemExample example);

    int updateByExample(@Param("record") WrongProblem record, @Param("example") WrongProblemExample example);

    int updateByPrimaryKeySelective(WrongProblem record);

    int updateByPrimaryKey(WrongProblem record);
}