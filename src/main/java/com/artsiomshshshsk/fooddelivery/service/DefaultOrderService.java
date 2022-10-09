package com.artsiomshshshsk.fooddelivery.service;

import com.artsiomshshshsk.fooddelivery.domain.Cart;
import com.artsiomshshshsk.fooddelivery.domain.Customer;
import com.artsiomshshshsk.fooddelivery.domain.Order;
import com.artsiomshshshsk.fooddelivery.domain.OrderItem;
import com.artsiomshshshsk.fooddelivery.exceptions.LowBalanceException;
import com.artsiomshshshsk.fooddelivery.repository.CustomerRepository;
import com.artsiomshshshsk.fooddelivery.repository.OrderItemRepository;
import com.artsiomshshshsk.fooddelivery.repository.OrderRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class DefaultOrderService implements OrderService {
    private final OrderRepository orderRepository;
    private final OrderItemRepository orderItemRepository;

    private final CustomerRepository customerRepository;


    public DefaultOrderService(OrderRepository orderRepository, OrderItemRepository orderItemRepository, CustomerRepository customerRepository) {
        this.orderRepository = orderRepository;
        this.orderItemRepository = orderItemRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    @Transactional
     public Order createOrder(Customer customer) throws LowBalanceException,IllegalStateException {
        Cart cart = customer.getCart();
        if(!customer.hasEnoughMoney()){
            throw new LowBalanceException("You don't have enough money, remove some items from your cart");
        }
        if(cart.isEmpty()) {
            throw new IllegalStateException("It is not possible to create Order with empty cart!!!");
        }

        List<OrderItem> orderItems = cart.getOrderItems();
        Order order = Order.builder()
                .customer(customer)
                .price(cart.getPrice())
                .timestampCreated(LocalDateTime.now())
                .orderItems(orderItems)
                .build();

        customer.addOrder(order);
        customer.setBalance(calculateCustomerBalanceAfterPayment(customer,order));
        orderItems.forEach(orderItem -> orderItem.setOrder(order));

        Order orderWithId = orderRepository.saveAndFlush(order);
        customerRepository.saveAndFlush(customer);
        orderItemRepository.saveAllAndFlush(orderItems);

        System.out.println(orderWithId);

        return orderWithId;
    }

    @Override
    public Optional<Order> findById(long id) {
        return orderRepository.findById(id);
    }

    private BigDecimal calculateCustomerBalanceAfterPayment(Customer customer, Order order){
        return customer.getBalance().subtract(order.getPrice());
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
