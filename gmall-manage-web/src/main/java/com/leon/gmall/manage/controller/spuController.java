package com.leon.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.leon.gmall.beans.PmsProductImage;
import com.leon.gmall.beans.PmsProductInfo;
import com.leon.gmall.beans.PmsProductSaleAttr;
import com.leon.gmall.service.SpuService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author Leon
 * @version V1.0
 * @Package com.leon.gmall.manage.controller
 * @date 2020/2/10 10:43
 */
@RestController
@CrossOrigin
public class spuController {

    @Reference
    SpuService spuService;

    @RequestMapping("spuImageList")
    public List<PmsProductImage> spuImageList(String spuId){

        List<PmsProductImage> pmsProductImages = spuService.spuImageList(spuId);

        return pmsProductImages;
    }

    @RequestMapping("spuSaleAttrList")
    public List<PmsProductSaleAttr> spuSaleAttrList(String spuId){

        List<PmsProductSaleAttr> pmsProductSaleAttrs = spuService.spuSaleAttrList(spuId);

        return pmsProductSaleAttrs;
    }

    @RequestMapping("fileUpload")
    public String fileUpload(@RequestParam(value = "file") MultipartFile multipartFile) {

        //将图片上传到分布式文件存储系统

        //将图片地址返回给前端
//        String imgUrl = PmsUploadUtil.uploadImage(multipartFile);
        return "imgUrl";
    }

    @RequestMapping("saveSpuInfo")
    @ResponseBody
    public String saveSpuInfo(@RequestBody PmsProductInfo pmsProductInfo){

        spuService.saveSpuInfo(pmsProductInfo);

        return "success";
    }

    @RequestMapping("spuList")
    public List<PmsProductInfo> spuList(String catalog3Id){

        List<PmsProductInfo> pmsProductInfos = spuService.spuList(catalog3Id);

        return pmsProductInfos;
    }
}
