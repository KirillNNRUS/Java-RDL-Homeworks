package io.humb1t.cache.factory;

import io.humb1t.OrderStatus;

public interface OrderFactory {
    default OrderForFactory createOrder(OrderStatus orderStatus, int itemsInOrderForFactory) {
        return new OrderForFactory(orderStatus, itemsInOrderForFactory);
    }
}
