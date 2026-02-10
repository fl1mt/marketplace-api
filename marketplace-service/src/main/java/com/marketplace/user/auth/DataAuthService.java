package com.marketplace.user.auth;
import com.marketplace.delivery.DeliveryAddress;
import com.marketplace.errors.BadRequestException;
import com.marketplace.errors.NotFoundException;
import com.marketplace.delivery.DeliveryAddressesRepository;
import com.marketplace.order.Order;
import com.marketplace.order.OrdersRepository;
import com.marketplace.user.User;
import com.marketplace.user.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DataAuthService {
    private final UsersRepository usersRepository;
    private final OrdersRepository ordersRepository;
    private final DeliveryAddressesRepository deliveryAddressesRepository;
    public DataAuthService(UsersRepository usersRepository, OrdersRepository ordersRepository, DeliveryAddressesRepository deliveryAddressesRepository) {
        this.usersRepository = usersRepository;
        this.ordersRepository = ordersRepository;
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

    public Order checkOrdersAffiliation(UUID orderId, UUID userId){
        Order order = ordersRepository.findByIdAndUserId(orderId, userId)
                .orElseThrow(() -> new NotFoundException("Order not found or access denied!")
                );
        return order;
    }
}
