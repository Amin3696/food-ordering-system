package com.food.ordering.system.order.service.domain.port.output.message.publisher.resturantapproval;

import com.food.ordering.system.order.service.domain.event.OrderPaidEvent;
import com.food.ordering.system.order.service.domain.event.publisher.DomainEventPublisher;

public interface OrderPaidRestaurantRequestMessagePublisher extends DomainEventPublisher<OrderPaidEvent> {
}
