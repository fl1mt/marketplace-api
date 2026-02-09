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
    @Mapping(target = "shippingCost", source = "shippingCost")
    @Mapping(target = "deliveryDate", source = "deliveryDate")
    @Mapping(target = "subtotal", source = "subtotal")
    @Mapping(target = "finalTotal", source = "finalTotal")
    @Mapping(target = "createdAt", source = "createdAt")
    @Mapping(target = "orderStatus", source = "orderStatus")
    OrderResponseDTO toResponseDTO(Order order);
}
