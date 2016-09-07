package com.chinataoshu.mapper;

import com.chinataoshu.pojo.Shopbook;
import com.chinataoshu.pojo.ShopbookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopbookMapper {
    int countByExample(ShopbookExample example);

    int deleteByExample(ShopbookExample example);

    int insert(Shopbook record);

    int insertSelective(Shopbook record);

    List<Shopbook> selectByExample(ShopbookExample example);

    int updateByExampleSelective(@Param("record") Shopbook record, @Param("example") ShopbookExample example);

    int updateByExample(@Param("record") Shopbook record, @Param("example") ShopbookExample example);
}