package com.artsiomshshshsk.fooddelivery.service;

import com.artsiomshshshsk.fooddelivery.domain.Customer;
import com.artsiomshshshsk.fooddelivery.domain.Order;
import org.aspectj.weaver.ast.Or;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    Order createOrder(Customer customer);
    Optional<Order> findById(long id);

    List<Order> getAllOrders();

}
