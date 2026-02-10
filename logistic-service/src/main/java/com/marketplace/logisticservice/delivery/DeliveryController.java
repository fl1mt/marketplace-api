package com.marketplace.logisticservice.delivery;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/delivery")
public class DeliveryController {
    private final DeliveryService deliveryService;

    public DeliveryController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @GetMapping
    public ResponseEntity<List<DeliveryResponse>> getDeliveries(){
        return ResponseEntity.ok(deliveryService.getDeliveries());
    }

    @PostMapping("/{orderId}/in-transit")
    public ResponseEntity<DeliveryResponse> updateDeliveryStatus(@PathVariable UUID orderId){
        return ResponseEntity.ok(deliveryService.markInTransit(orderId));
    }
}
