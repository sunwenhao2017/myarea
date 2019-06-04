package com.qtone.hdkt.dao.authority;

import com.qtone.hdkt.model.authority.DictAuthorityData;
import com.qtone.hdkt.model.authority.DictAuthorityDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictAuthorityDataMapper {
    int countByExample(DictAuthorityDataExample example);

    int deleteByExample(DictAuthorityDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DictAuthorityData record);

    int insertSelective(DictAuthorityData record);

    List<DictAuthorityData> selectByExample(DictAuthorityDataExample example);

    DictAuthorityData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DictAuthorityData record, @Param("example") DictAuthorityDataExample example);

    int updateByExample(@Param("record") DictAuthorityData record, @Param("example") DictAuthorityDataExample example);

    int updateByPrimaryKeySelective(DictAuthorityData record);

    int updateByPrimaryKey(DictAuthorityData record);
}