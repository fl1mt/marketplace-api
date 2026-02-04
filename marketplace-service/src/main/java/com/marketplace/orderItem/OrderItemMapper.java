package com.marketplace.orderItem;

import com.marketplace.product.ProductMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface OrderItemMapper {
    OrderItem toEntity(OrderItemRequestDTO requestDTO);
    @Mapping(target = "productSnapshotDTO", source = "product")
    OrderItemResponseDTO toOrderItemDTO(OrderItem orderItem);
    List<OrderItemResponseDTO> toOrderItemsListDTO(List<OrderItem> orderItems);
}
