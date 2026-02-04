package com.marketplace.delivery;

import com.marketplace.security.CustomUserDetails;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/deliveryAddress")
public class DeliveryAddressController {
    private final DeliveryAddressService deliveryAddressService;
    public DeliveryAddressController(DeliveryAddressService deliveryAddressService) {
        this.deliveryAddressService = deliveryAddressService;
    }
    @PostMapping
    public ResponseEntity<DeliveryAddressResponseDTO> addUserDeliveryAddress(@AuthenticationPrincipal CustomUserDetails userDetails,
                                                                             @Valid @RequestBody DeliveryAddressRequestDTO deliveryAddressRequestDTO) {
        return ResponseEntity.ok(deliveryAddressService.addUserDeliveryAddress(userDetails.getId(), deliveryAddressRequestDTO));
    }
    @GetMapping
    public ResponseEntity<List<DeliveryAddressResponseDTO>> getUsersDeliveryAddresses(@AuthenticationPrincipal CustomUserDetails userDetails){
        return ResponseEntity.ok(deliveryAddressService.getUsersDeliveryAddresses(userDetails.getId()));
    }
}
