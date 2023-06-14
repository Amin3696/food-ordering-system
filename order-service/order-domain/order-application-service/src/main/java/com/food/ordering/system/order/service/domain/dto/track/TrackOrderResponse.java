package com.food.ordering.system.order.service.domain.dto.track;

import com.food.ordering.system.order.service.domain.valueobject.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class TrackOrderResponse {
    @NotNull
    public final UUID orderTrackingID;
    @NotNull
    public final OrderStatus orderStatus;

    public final List<String> failureMessages;
}
