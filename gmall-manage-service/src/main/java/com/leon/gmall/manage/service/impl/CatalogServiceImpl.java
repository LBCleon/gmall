package com.leon.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.leon.gmall.beans.PmsBaseCatalog1;
import com.leon.gmall.beans.PmsBaseCatalog2;
import com.leon.gmall.beans.PmsBaseCatalog3;
import com.leon.gmall.manage.mapper.PmsBaseCatalog1Mapper;
import com.leon.gmall.manage.mapper.PmsBaseCatalog2Mapper;
import com.leon.gmall.manage.mapper.PmsBaseCatalog3Mapper;
import com.leon.gmall.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Leon
 * @version V1.0
 * @Package com.leon.gmall.manage.service.impl
 * @date 2020/2/8 18:41
 */
@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;

    @Autowired
    PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;

    @Autowired
    PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;

    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        List<PmsBaseCatalog1> catalog1s = pmsBaseCatalog1Mapper.selectAll();
        return catalog1s;
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id) {
        PmsBaseCatalog2 pmsBaseCatalog2 = new PmsBaseCatalog2();
        pmsBaseCatalog2.setCatalog1Id(catalog1Id);
        List<PmsBaseCatalog2> catalog2s = pmsBaseCatalog2Mapper.select(pmsBaseCatalog2);
        return catalog2s;
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id) {
        PmsBaseCatalog3 pmsBaseCatalog3 = new PmsBaseCatalog3();
        pmsBaseCatalog3.setCatalog2Id(catalog2Id);
        List<PmsBaseCatalog3> catalog3s = pmsBaseCatalog3Mapper.select(pmsBaseCatalog3);
        return catalog3s;
    }
}
