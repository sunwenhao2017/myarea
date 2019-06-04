package com.qtone.hdkt.dao.authority;

import com.qtone.hdkt.model.authority.AuthrityGroup;
import com.qtone.hdkt.model.authority.AuthrityGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthrityGroupMapper {
    int countByExample(AuthrityGroupExample example);

    int deleteByExample(AuthrityGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthrityGroup record);

    int insertSelective(AuthrityGroup record);

    List<AuthrityGroup> selectByExample(AuthrityGroupExample example);

    AuthrityGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthrityGroup record, @Param("example") AuthrityGroupExample example);

    int updateByExample(@Param("record") AuthrityGroup record, @Param("example") AuthrityGroupExample example);

    int updateByPrimaryKeySelective(AuthrityGroup record);

    int updateByPrimaryKey(AuthrityGroup record);
}