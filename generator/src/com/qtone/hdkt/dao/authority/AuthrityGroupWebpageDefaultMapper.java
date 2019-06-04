package com.qtone.hdkt.dao.authority;

import com.qtone.hdkt.model.authority.AuthrityGroupWebpageDefault;
import com.qtone.hdkt.model.authority.AuthrityGroupWebpageDefaultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthrityGroupWebpageDefaultMapper {
    int countByExample(AuthrityGroupWebpageDefaultExample example);

    int deleteByExample(AuthrityGroupWebpageDefaultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthrityGroupWebpageDefault record);

    int insertSelective(AuthrityGroupWebpageDefault record);

    List<AuthrityGroupWebpageDefault> selectByExample(AuthrityGroupWebpageDefaultExample example);

    AuthrityGroupWebpageDefault selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthrityGroupWebpageDefault record, @Param("example") AuthrityGroupWebpageDefaultExample example);

    int updateByExample(@Param("record") AuthrityGroupWebpageDefault record, @Param("example") AuthrityGroupWebpageDefaultExample example);

    int updateByPrimaryKeySelective(AuthrityGroupWebpageDefault record);

    int updateByPrimaryKey(AuthrityGroupWebpageDefault record);
}