package com.leon.gmall.service;

import com.leon.gmall.beans.OmsOrder;

/**
 * @author Leon
 * @version V1.0
 * @Package com.leon.gmall.service
 * @date 2020/2/29 15:36
 */
public interface OrderService {
    String checkTradeCode(String memberId, String tradeCode);

    String genTradeCode(String memberId);

    void saveOrder(OmsOrder omsOrder);

    OmsOrder getOrderByOutTradeNo(String outTradeNo);

    void updateOrder(OmsOrder omsOrder);
}
