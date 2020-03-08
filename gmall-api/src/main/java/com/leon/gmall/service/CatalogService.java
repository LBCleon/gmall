package com.leon.gmall.service;

import com.leon.gmall.beans.PmsBaseCatalog1;
import com.leon.gmall.beans.PmsBaseCatalog2;
import com.leon.gmall.beans.PmsBaseCatalog3;

import java.util.List;

/**
 * @author Leon
 * @version V1.0
 * @Package com.leon.gmall.service
 * @date 2020/2/8 18:40
 */
public interface CatalogService {
    List<PmsBaseCatalog1> getCatalog1();

    List<PmsBaseCatalog2> getCatalog2(String catalog1Id);

    List<PmsBaseCatalog3> getCatalog3(String catalog2Id);
}
