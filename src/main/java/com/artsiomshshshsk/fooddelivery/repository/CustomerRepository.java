package com.artsiomshshshsk.fooddelivery.repository;

import com.artsiomshshshsk.fooddelivery.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Optional<Customer> findByEmail(String email);
}
