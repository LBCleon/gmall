package com.leon.gmall.manage.service;

import com.leon.gmall.beans.PmsSkuInfo;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Leon
 * @version V1.0
 * @Package com.leon.gmall.manage.service
 * @date 2020/2/10 14:19
 */
public interface SkuService {
    void saveSkuInfo(PmsSkuInfo pmsSkuInfo);

    PmsSkuInfo getSkuById(String skuId);

    List<PmsSkuInfo> getSkuSaleAttrValueListBySpu(String productId);

    boolean checkPrice(String productSkuId, BigDecimal price);
}
