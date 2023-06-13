package com.food.ordering.system.order.service.domain.entity;

import com.food.ordering.system.order.service.domain.OrderDomainService;
import com.food.ordering.system.order.service.domain.event.OrderCancelledEvent;
import com.food.ordering.system.order.service.domain.event.OrderCreatedEvent;

import java.util.List;

public class OrderDomainServiceImpl implements OrderDomainService {

    @Override
    public OrderCreatedEvent validateAndInitiateOrder(Order order, Restaurant restaurant) {
        validateRestaurant(restaurant);
        setOrderProductInformation(order,restaurant);
        return null;
    }

    @Override
    public void payOrder(Order order) {

    }

    @Override
    public OrderCancelledEvent cancelOrderPayment(Order order, List<String> failureMessages) {
        return null;
    }

    @Override
    public void cancelOrder(Order order, List<String> failureMessages) {

    }

    private void validateRestaurant(Restaurant restaurant) {

    }

    private void setOrderProductInformation(Order order, Restaurant restaurant) {
    }
}
