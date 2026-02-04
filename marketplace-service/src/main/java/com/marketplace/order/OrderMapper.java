package com.marketplace.order;

import com.marketplace.delivery.DeliveryAddressMapper;
import com.marketplace.user.UserMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {UserMapper.class, DeliveryAddressMapper.class})
public interface OrderMapper {
    Order toEntity(OrderRequestDTO requestDTO);
    @Mapping(target = "userPublicDTO", source = "user")
    @Mapping(target = "deliveryAddressResponseDTO", source = "address")
    OrderResponseDTO toResponseDTO(Order order);
}
