package com.artsiomshshshsk.fooddelivery.repository;

import com.artsiomshshshsk.fooddelivery.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
