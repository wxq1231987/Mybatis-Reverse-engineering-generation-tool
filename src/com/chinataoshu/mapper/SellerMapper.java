package com.chinataoshu.mapper;

import com.chinataoshu.pojo.Seller;
import com.chinataoshu.pojo.SellerExample;
import com.chinataoshu.pojo.SellerWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SellerMapper {
    int countByExample(SellerExample example);

    int deleteByExample(SellerExample example);

    int deleteByPrimaryKey(Integer sellerid);

    int insert(SellerWithBLOBs record);

    int insertSelective(SellerWithBLOBs record);

    List<SellerWithBLOBs> selectByExampleWithBLOBs(SellerExample example);

    List<Seller> selectByExample(SellerExample example);

    SellerWithBLOBs selectByPrimaryKey(Integer sellerid);

    int updateByExampleSelective(@Param("record") SellerWithBLOBs record, @Param("example") SellerExample example);

    int updateByExampleWithBLOBs(@Param("record") SellerWithBLOBs record, @Param("example") SellerExample example);

    int updateByExample(@Param("record") Seller record, @Param("example") SellerExample example);

    int updateByPrimaryKeySelective(SellerWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SellerWithBLOBs record);

    int updateByPrimaryKey(Seller record);
}