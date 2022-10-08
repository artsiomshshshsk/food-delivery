package com.artsiomshshshsk.fooddelivery.service;


import com.artsiomshshshsk.fooddelivery.domain.Customer;

import java.util.Optional;


public interface CustomerService {
    Optional<Customer> findCustomerByEmail(String email);

}
