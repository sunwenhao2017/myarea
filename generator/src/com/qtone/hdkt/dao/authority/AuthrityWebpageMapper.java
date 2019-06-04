package com.qtone.hdkt.dao.authority;

import com.qtone.hdkt.model.authority.AuthrityWebpage;
import com.qtone.hdkt.model.authority.AuthrityWebpageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthrityWebpageMapper {
    int countByExample(AuthrityWebpageExample example);

    int deleteByExample(AuthrityWebpageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthrityWebpage record);

    int insertSelective(AuthrityWebpage record);

    List<AuthrityWebpage> selectByExample(AuthrityWebpageExample example);

    AuthrityWebpage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthrityWebpage record, @Param("example") AuthrityWebpageExample example);

    int updateByExample(@Param("record") AuthrityWebpage record, @Param("example") AuthrityWebpageExample example);

    int updateByPrimaryKeySelective(AuthrityWebpage record);

    int updateByPrimaryKey(AuthrityWebpage record);
}