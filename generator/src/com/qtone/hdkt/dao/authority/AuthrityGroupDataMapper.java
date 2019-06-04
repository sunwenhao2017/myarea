package com.qtone.hdkt.dao.authority;

import com.qtone.hdkt.model.authority.AuthrityGroupData;
import com.qtone.hdkt.model.authority.AuthrityGroupDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthrityGroupDataMapper {
    int countByExample(AuthrityGroupDataExample example);

    int deleteByExample(AuthrityGroupDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthrityGroupData record);

    int insertSelective(AuthrityGroupData record);

    List<AuthrityGroupData> selectByExample(AuthrityGroupDataExample example);

    AuthrityGroupData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthrityGroupData record, @Param("example") AuthrityGroupDataExample example);

    int updateByExample(@Param("record") AuthrityGroupData record, @Param("example") AuthrityGroupDataExample example);

    int updateByPrimaryKeySelective(AuthrityGroupData record);

    int updateByPrimaryKey(AuthrityGroupData record);
}