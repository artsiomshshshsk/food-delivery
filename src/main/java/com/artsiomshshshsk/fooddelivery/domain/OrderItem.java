package com.artsiomshshshsk.fooddelivery.domain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "ORDER_ITEM")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int pieces;
    private BigDecimal price;
    @ManyToOne
    @JoinColumn(name = "order_id")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Order order;
    @OneToOne
    @JoinColumn(name = "food_id")
    private Food food;
}
