package com.artsiomshshshsk.fooddelivery.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "_ORDER")
public class Order {
    @Id
    @GeneratedValue(generator = "increment")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @JsonIgnore
    private Customer customer;
    private BigDecimal price;
    @Column(name = "timestamp_created")
    private LocalDateTime timestampCreated;
    @OneToMany(
            mappedBy = "order",
            fetch = FetchType.EAGER
    )
    private List<OrderItem> orderItems;

}
