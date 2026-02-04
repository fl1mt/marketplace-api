package com.marketplace.user.auth;
import com.marketplace.delivery.DeliveryAddress;
import com.marketplace.errors.NotFoundException;
import com.marketplace.delivery.DeliveryAddressesRepository;
import com.marketplace.user.User;
import com.marketplace.user.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DataAuthService {
    private final UsersRepository usersRepository;
    private final DeliveryAddressesRepository deliveryAddressesRepository;
    public DataAuthService(UsersRepository usersRepository, DeliveryAddressesRepository deliveryAddressesRepository) {
        this.usersRepository = usersRepository;
        this.deliveryAddressesRepository = deliveryAddressesRepository;
    }
    public User checkUsersId(UUID userId){
        User user = usersRepository.findById(userId)
                .orElseThrow(() -> new NotFoundException("User not found or access denied"));
        return user;
    }
    public DeliveryAddress checkUsersDeliveryAddress(UUID deliveryAddressId, UUID userId){
        DeliveryAddress deliveryAddress = deliveryAddressesRepository.findByIdAndUserId(deliveryAddressId, userId)
                .orElseThrow(() -> new NotFoundException("Address not found or access denied"));
        return deliveryAddress;
    }
}
