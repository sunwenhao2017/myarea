package com.qtone.hdkt.dao.authority;

import com.qtone.hdkt.model.authority.AuthrityTeacherGroup;
import com.qtone.hdkt.model.authority.AuthrityTeacherGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthrityTeacherGroupMapper {
    int countByExample(AuthrityTeacherGroupExample example);

    int deleteByExample(AuthrityTeacherGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthrityTeacherGroup record);

    int insertSelective(AuthrityTeacherGroup record);

    List<AuthrityTeacherGroup> selectByExample(AuthrityTeacherGroupExample example);

    AuthrityTeacherGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthrityTeacherGroup record, @Param("example") AuthrityTeacherGroupExample example);

    int updateByExample(@Param("record") AuthrityTeacherGroup record, @Param("example") AuthrityTeacherGroupExample example);

    int updateByPrimaryKeySelective(AuthrityTeacherGroup record);

    int updateByPrimaryKey(AuthrityTeacherGroup record);
}