package com.artsiomshshshsk.fooddelivery.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cart {
    private BigDecimal price;
    private List<OrderItem> orderItems;
    public boolean isEmpty(){
        return orderItems.isEmpty();
    }
    public void removeOrderItem(OrderItem orderItem){
        orderItems.remove(orderItem);
    }
}