package com.leon.gmall.service;

import com.leon.gmall.beans.PmsProductImage;
import com.leon.gmall.beans.PmsProductInfo;
import com.leon.gmall.beans.PmsProductSaleAttr;

import java.util.List;

/**
 * @author Leon
 * @version V1.0
 * @Package com.leon.gmall.service
 * @date 2020/2/9 13:43
 */
public interface SpuService {
    List<PmsProductInfo> spuList(String catalog3Id);

    void saveSpuInfo(PmsProductInfo pmsProductInfo);

    List<PmsProductSaleAttr> spuSaleAttrList(String spuId);

    List<PmsProductImage> spuImageList(String spuId);

    List<PmsProductSaleAttr> spuSaleAttrListCheckBySku(String productId,String skuId);
}

