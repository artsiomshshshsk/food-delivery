package com.artsiomshshshsk.fooddelivery.domain;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CUSTOMER")
public class Customer extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private BigDecimal balance;

    @Transient
    private Cart cart;

    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    private List<Order> orders;

    @Builder
    public Customer(String email, String password, Long id, String name, BigDecimal balance, Cart cart, List<Order> orders) {
        super(email, password);
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.cart = cart;
        this.orders = orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public boolean hasEnoughMoney(){
        return getBalance().compareTo(getCart().getPrice()) >= 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Customer customer = (Customer) o;
        return id != null && Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}