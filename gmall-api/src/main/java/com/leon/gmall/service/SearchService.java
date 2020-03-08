package com.leon.gmall.service;

import com.leon.gmall.beans.PmsSearchParam;
import com.leon.gmall.beans.PmsSearchSkuInfo;

import java.util.List;

/**
 * @author Leon
 * @version V1.0
 * @Package com.leon.gmall.service
 * @date 2020/2/18 21:34
 */
public interface SearchService {
    List<PmsSearchSkuInfo> list(PmsSearchParam pmsSearchParam);
}
