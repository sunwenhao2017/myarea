package com.qtone.hdkt.dao.authority;

import com.qtone.hdkt.model.authority.AuthrityDataInterface;
import com.qtone.hdkt.model.authority.AuthrityDataInterfaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthrityDataInterfaceMapper {
    int countByExample(AuthrityDataInterfaceExample example);

    int deleteByExample(AuthrityDataInterfaceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthrityDataInterface record);

    int insertSelective(AuthrityDataInterface record);

    List<AuthrityDataInterface> selectByExample(AuthrityDataInterfaceExample example);

    AuthrityDataInterface selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthrityDataInterface record, @Param("example") AuthrityDataInterfaceExample example);

    int updateByExample(@Param("record") AuthrityDataInterface record, @Param("example") AuthrityDataInterfaceExample example);

    int updateByPrimaryKeySelective(AuthrityDataInterface record);

    int updateByPrimaryKey(AuthrityDataInterface record);
}