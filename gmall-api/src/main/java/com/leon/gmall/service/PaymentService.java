package com.leon.gmall.service;

import com.leon.gmall.beans.PaymentInfo;

import java.util.Map;

/**
 * @author Leon
 * @version V1.0
 * @Package com.leon.gmall.service
 * @date 2020/3/4 19:42
 */
public interface PaymentService {
    void savePaymentInfo(PaymentInfo paymentInfo);

    void updatePayment(PaymentInfo paymentInfo);

    void sendDelayPaymentResultCheckQueue(String outTradeNo, int i);

    Map<String, Object> checkAlipayPayment(String out_trade_no);
}
