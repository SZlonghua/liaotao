package com.liaotao.event;

/**
 * @Auther: liaotao
 * @Date: 2019/3/21 16:11
 * @Description:
 */
public class Order {

    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                '}';
    }

    public Order(String orderId) {
        this.orderId = orderId;
    }
}
