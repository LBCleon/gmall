package com.leon.gmall.service;

import com.leon.gmall.beans.OmsCartItem;

import java.util.List;

/**
 * @author Leon
 * @version V1.0
 * @Package com.leon.gmall.service
 * @date 2020/2/21 14:45
 */
public interface CartService {
    OmsCartItem ifCartExistByUser(String memberId, String skuId);

    void addCart(OmsCartItem omsCartItem);

    void updateCart(OmsCartItem omsCartItemFromDb);

    void flushCartCache(String memberId);

    List<OmsCartItem> cartList(String memberId);

    void checkCart(OmsCartItem omsCartItem);
}
