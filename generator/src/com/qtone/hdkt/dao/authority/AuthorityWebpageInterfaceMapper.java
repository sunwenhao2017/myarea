package com.qtone.hdkt.dao.authority;

import com.qtone.hdkt.model.authority.AuthorityWebpageInterface;
import com.qtone.hdkt.model.authority.AuthorityWebpageInterfaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthorityWebpageInterfaceMapper {
    int countByExample(AuthorityWebpageInterfaceExample example);

    int deleteByExample(AuthorityWebpageInterfaceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthorityWebpageInterface record);

    int insertSelective(AuthorityWebpageInterface record);

    List<AuthorityWebpageInterface> selectByExample(AuthorityWebpageInterfaceExample example);

    AuthorityWebpageInterface selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthorityWebpageInterface record, @Param("example") AuthorityWebpageInterfaceExample example);

    int updateByExample(@Param("record") AuthorityWebpageInterface record, @Param("example") AuthorityWebpageInterfaceExample example);

    int updateByPrimaryKeySelective(AuthorityWebpageInterface record);

    int updateByPrimaryKey(AuthorityWebpageInterface record);
}