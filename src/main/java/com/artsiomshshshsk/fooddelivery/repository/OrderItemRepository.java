package com.artsiomshshshsk.fooddelivery.repository;

import com.artsiomshshshsk.fooddelivery.domain.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
