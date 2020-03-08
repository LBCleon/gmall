package com.leon.gmall.manage.mapper;

import com.leon.gmall.beans.PmsSkuInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author Leon
 * @version V1.0
 * @Package com.leon.gmall.manage.mapper
 * @date 2020/2/10 14:22
 */
public interface PmsSkuInfoMapper extends Mapper<PmsSkuInfo> {
    List<PmsSkuInfo> selectSkuSaleAttrValueListBySpu(String productId);
}
