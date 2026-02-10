package com.marketplace.logisticservice.delivery;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DeliveryMapper {

    DeliveryResponse toDTO(Delivery delivery);
    List<DeliveryResponse> toResponseDtoList(List<Delivery> deliveries);
}
