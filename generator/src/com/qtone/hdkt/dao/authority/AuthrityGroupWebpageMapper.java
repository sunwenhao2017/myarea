package com.qtone.hdkt.dao.authority;

import com.qtone.hdkt.model.authority.AuthrityGroupWebpage;
import com.qtone.hdkt.model.authority.AuthrityGroupWebpageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthrityGroupWebpageMapper {
    int countByExample(AuthrityGroupWebpageExample example);

    int deleteByExample(AuthrityGroupWebpageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthrityGroupWebpage record);

    int insertSelective(AuthrityGroupWebpage record);

    List<AuthrityGroupWebpage> selectByExample(AuthrityGroupWebpageExample example);

    AuthrityGroupWebpage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthrityGroupWebpage record, @Param("example") AuthrityGroupWebpageExample example);

    int updateByExample(@Param("record") AuthrityGroupWebpage record, @Param("example") AuthrityGroupWebpageExample example);

    int updateByPrimaryKeySelective(AuthrityGroupWebpage record);

    int updateByPrimaryKey(AuthrityGroupWebpage record);
}