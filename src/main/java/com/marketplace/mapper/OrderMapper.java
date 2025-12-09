package com.marketplace.mapper;

import com.marketplace.dto.OrderRequestDTO;
import com.marketplace.dto.OrderResponseDTO;
import com.marketplace.entity.Order;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "string")
public interface OrderMapper {

    Order toEntity(OrderRequestDTO requestDTO);

    OrderResponseDTO toResponseDTO(Order order);

    List<OrderResponseDTO> toOrderDtoList(List<Order> orders);
}
