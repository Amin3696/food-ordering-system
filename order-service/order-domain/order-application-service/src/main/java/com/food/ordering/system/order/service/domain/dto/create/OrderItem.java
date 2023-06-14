package com.food.ordering.system.order.service.domain.dto.create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class OrderItem {
    @NotNull
    public final UUID productId;
    @NotNull
    public final int quantity;
    @NotNull
    public final BigDecimal price;
    @NotNull
    public final BigDecimal subTotal;

}
