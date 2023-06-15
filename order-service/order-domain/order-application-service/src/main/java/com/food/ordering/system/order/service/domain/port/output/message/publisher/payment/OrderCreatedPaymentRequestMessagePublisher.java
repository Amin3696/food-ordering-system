package com.food.ordering.system.order.service.domain.port.output.message.publisher.payment;

import com.food.ordering.system.order.service.domain.event.OrderCreatedEvent;
import com.food.ordering.system.order.service.domain.event.publisher.DomainEventPublisher;

public interface OrderCreatedPaymentRequestMessagePublisher extends DomainEventPublisher<OrderCreatedEvent> {

}
