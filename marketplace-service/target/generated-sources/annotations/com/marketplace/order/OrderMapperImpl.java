package com.marketplace.order;

import com.marketplace.delivery.DeliveryAddressMapper;
import com.marketplace.user.UserMapper;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-05T02:55:42+0500",
    comments = "version: 1.6.2, compiler: javac, environment: Java 17.0.16 (Eclipse Adoptium)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DeliveryAddressMapper deliveryAddressMapper;

    @Override
    public Order toEntity(OrderRequestDTO requestDTO) {
        if ( requestDTO == null ) {
            return null;
        }

        Order order = new Order();

        order.setDeliveryDate( requestDTO.getDeliveryDate() );

        return order;
    }

    @Override
    public OrderResponseDTO toResponseDTO(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderResponseDTO orderResponseDTO = new OrderResponseDTO();

        orderResponseDTO.setUserPublicDTO( userMapper.toPublicDTO( order.getUser() ) );
        orderResponseDTO.setDeliveryAddressResponseDTO( deliveryAddressMapper.toDeliveryAddressDTO( order.getAddress() ) );
        orderResponseDTO.setId( order.getId() );
        orderResponseDTO.setDeliveryDate( order.getDeliveryDate() );
        orderResponseDTO.setFinalTotal( order.getFinalTotal() );
        orderResponseDTO.setCreatedAt( order.getCreatedAt() );
        orderResponseDTO.setSubtotal( order.getSubtotal() );

        return orderResponseDTO;
    }
}
