package com.marketplace.mapper;

import com.marketplace.dto.DeliveryAddressRequestDTO;
import com.marketplace.dto.DeliveryAddressResponseDTO;
import com.marketplace.entity.DeliveryAddress;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "string")
public interface DeliveryAddressMapper {

    DeliveryAddress toEntity(DeliveryAddressRequestDTO requestDTO);

    DeliveryAddressResponseDTO toDeliveryAddressDTO(DeliveryAddress deliveryAddress);

    List<DeliveryAddressResponseDTO> toDeliveryAddressesDto(List<DeliveryAddress> deliveryAddresses);

}
