package com.artsiomshshshsk.fooddelivery.controller;

import com.artsiomshshshsk.fooddelivery.assembler.OrderModelAssembler;
import com.artsiomshshshsk.fooddelivery.domain.Cart;
import com.artsiomshshshsk.fooddelivery.domain.Customer;
import com.artsiomshshshsk.fooddelivery.domain.Order;
import com.artsiomshshshsk.fooddelivery.exceptions.NotFoundException;
import com.artsiomshshshsk.fooddelivery.service.CustomerService;
import com.artsiomshshshsk.fooddelivery.service.OrderService;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import com.artsiomshshshsk.fooddelivery.exceptions.AccessDeniedException;



@RestController
@RequestMapping("/orderservice")
public class OrderController {

    private final OrderService orderService;
    private final OrderModelAssembler orderModelAssembler;

    private final CustomerService customerService;

    public OrderController(OrderService orderService, OrderModelAssembler orderModelAssembler, CustomerService customerService) {
        this.orderService = orderService;
        this.orderModelAssembler = orderModelAssembler;
        this.customerService = customerService;
    }

    @GetMapping("/orders")
    public CollectionModel<EntityModel<Order>> getAllOrders(){
        Customer customer = getCustomer();
        return CollectionModel.of(orderService.getAllOrders().stream()
                .filter(order -> order.getCustomer().equals(customer))
                .map(orderModelAssembler::toModel)
                .toList());
    }

    @GetMapping("/orders/{id}")
    public EntityModel<Order> getOrderById(@PathVariable Long id){
        Customer customer = getCustomer();
        Order order = orderService.findById(id)
                .orElseThrow(()->new NotFoundException("There is no order with such id"));
        if(!order.getCustomer().equals(customer)){
            throw new AccessDeniedException("You don't have access to this order");
        }
        return orderModelAssembler.toModel(order);
    }
    @PostMapping("/orders")
    public EntityModel<Order> postOrder(@RequestBody Cart cart){
        Customer customer =getCustomer();
        customer.setCart(cart);
        return orderModelAssembler.toModel(orderService.createOrder(customer));
    }
    private Customer getCustomer(){
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String userEmail = userDetails.getUsername();
        return customerService.findCustomerByEmail(userEmail).orElseThrow(
                ()->new NotFoundException("There is no customer with such credentials")
        );
    }
}
