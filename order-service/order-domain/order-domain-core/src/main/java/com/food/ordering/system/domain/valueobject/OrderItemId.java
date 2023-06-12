package com.food.ordering.system.domain.valueobject;

import java.util.UUID;

public class OrderItemId extends BaseId<Long> {
    protected OrderItemId(Long value) {
        super(value);
    }
}
