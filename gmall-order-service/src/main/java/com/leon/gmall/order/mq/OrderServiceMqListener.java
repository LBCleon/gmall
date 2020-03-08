package com.leon.gmall.order.mq;

import com.leon.gmall.beans.OmsOrder;
import com.leon.gmall.order.service.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.MapMessage;

/**
 * @author Leon
 * @version V1.0
 * @Package com.leon.gmall.order.mq
 * @date 2020/3/7 11:41
 */
@Component
public class OrderServiceMqListener {
    @Autowired
    OrderServiceImpl orderService;

    @JmsListener(destination = "PAYHMENT_SUCCESS_QUEUE",containerFactory = "jmsQueueListener")
    public void consumePaymentResult(MapMessage mapMessage) throws JMSException {
        String out_trade_no = mapMessage.getString("out_trade_no");

        //更新订单状态业务
        OmsOrder omsOrder = new OmsOrder();
        omsOrder.setOrderSn(out_trade_no);
        orderService.updateOrder(omsOrder);
    }
}
