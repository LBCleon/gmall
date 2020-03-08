package com.leon.gmall.service;

import com.leon.gmall.beans.PmsBaseAttrInfo;
import com.leon.gmall.beans.PmsBaseAttrValue;
import com.leon.gmall.beans.PmsBaseSaleAttr;

import java.util.List;
import java.util.Set;

/**
 * @author Leon
 * @version V1.0
 * @Package com.leon.gmall.manage.service
 * @date 2020/2/8 20:38
 */
public interface AttrService {
    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    List<PmsBaseAttrValue> getAttrValueList(String attrId);

    List<PmsBaseSaleAttr> baseSaleAttrList();

    List<PmsBaseAttrInfo> getAttrValueListByValueId(Set<String> valueIdSet);
}
