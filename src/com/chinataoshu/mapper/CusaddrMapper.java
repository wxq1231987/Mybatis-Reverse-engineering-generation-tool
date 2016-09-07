package com.chinataoshu.mapper;

import com.chinataoshu.pojo.Cusaddr;
import com.chinataoshu.pojo.CusaddrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CusaddrMapper {
    int countByExample(CusaddrExample example);

    int deleteByExample(CusaddrExample example);

    int deleteByPrimaryKey(Integer addrid);

    int insert(Cusaddr record);

    int insertSelective(Cusaddr record);

    List<Cusaddr> selectByExample(CusaddrExample example);

    Cusaddr selectByPrimaryKey(Integer addrid);

    int updateByExampleSelective(@Param("record") Cusaddr record, @Param("example") CusaddrExample example);

    int updateByExample(@Param("record") Cusaddr record, @Param("example") CusaddrExample example);

    int updateByPrimaryKeySelective(Cusaddr record);

    int updateByPrimaryKey(Cusaddr record);
}