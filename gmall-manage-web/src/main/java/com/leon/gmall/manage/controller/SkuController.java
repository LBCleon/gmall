package com.leon.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.leon.gmall.beans.PmsSkuInfo;
import com.leon.gmall.manage.service.SkuService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Leon
 * @version V1.0
 * @Package com.leon.gmall.manage.controller
 * @date 2020/2/10 14:05
 */
@RestController
@CrossOrigin
public class SkuController {

    @Reference
    SkuService skuService;

    @RequestMapping("saveSkuInfo")
    public String saveSkuInfo(@RequestBody PmsSkuInfo pmsSkuInfo) {
        // 将spuId封装给productId
        pmsSkuInfo.setProductId(pmsSkuInfo.getSpuId());

        // 处理默认图片
//        String skuDefaultImg = pmsSkuInfo.getSkuDefaultImg();
//        if(StringUtils.isBlank(skuDefaultImg)){
//            pmsSkuInfo.setSkuDefaultImg(pmsSkuInfo.getSkuImageList().get(0).getImgUrl());
//        }


        skuService.saveSkuInfo(pmsSkuInfo);

        return "success";
    }
}
