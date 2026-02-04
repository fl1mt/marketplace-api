package com.marketplace.delivery;

import com.marketplace.delivery.DeliveryAddressRequestDTO;
import com.marketplace.delivery.DeliveryAddressResponseDTO;
import com.marketplace.delivery.DeliveryAddress;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DeliveryAddressMapper {

    DeliveryAddress toEntity(DeliveryAddressRequestDTO requestDTO);
    DeliveryAddressResponseDTO toDeliveryAddressDTO(DeliveryAddress deliveryAddress);
    List<DeliveryAddressResponseDTO> toDeliveryAddressesDto(List<DeliveryAddress> deliveryAddresses);

}
