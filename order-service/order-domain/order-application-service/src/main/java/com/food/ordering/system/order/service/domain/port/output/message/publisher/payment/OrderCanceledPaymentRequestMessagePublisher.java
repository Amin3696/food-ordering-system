package com.food.ordering.system.order.service.domain.port.output.message.publisher.payment;

import com.food.ordering.system.order.service.domain.event.OrderCanceledEvent;
import com.food.ordering.system.order.service.domain.event.publisher.DomainEventPublisher;

public interface OrderCanceledPaymentRequestMessagePublisher extends DomainEventPublisher<OrderCanceledEvent> {
}
