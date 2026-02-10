package com.marketplace.logisticservice.delivery;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-11T02:33:27+0500",
    comments = "version: 1.6.2, compiler: javac, environment: Java 24.0.2 (Amazon.com Inc.)"
)
@Component
public class DeliveryMapperImpl implements DeliveryMapper {

    @Override
    public DeliveryResponse toDTO(Delivery delivery) {
        if ( delivery == null ) {
            return null;
        }

        DeliveryResponse deliveryResponse = new DeliveryResponse();

        deliveryResponse.setId( delivery.getId() );
        deliveryResponse.setOrderId( delivery.getOrderId() );
        deliveryResponse.setShippingCost( delivery.getShippingCost() );
        deliveryResponse.setDeliveryDate( delivery.getDeliveryDate() );
        deliveryResponse.setDeliveryStatus( delivery.getDeliveryStatus() );

        return deliveryResponse;
    }

    @Override
    public List<DeliveryResponse> toResponseDtoList(List<Delivery> deliveries) {
        if ( deliveries == null ) {
            return null;
        }

        List<DeliveryResponse> list = new ArrayList<DeliveryResponse>( deliveries.size() );
        for ( Delivery delivery : deliveries ) {
            list.add( toDTO( delivery ) );
        }

        return list;
    }
}
