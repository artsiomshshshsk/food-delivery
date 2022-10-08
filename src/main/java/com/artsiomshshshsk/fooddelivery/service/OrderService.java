package com.artsiomshshshsk.fooddelivery.service;

import com.artsiomshshshsk.fooddelivery.domain.Customer;
import com.artsiomshshshsk.fooddelivery.domain.Order;

public interface OrderService {
    public Order createOrder(Customer customer);
}
