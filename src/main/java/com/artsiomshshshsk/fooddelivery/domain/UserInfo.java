package com.artsiomshshshsk.fooddelivery.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "USERS")
public class UserInfo {
    @Id
    @GeneratedValue(generator = "increment")
    private long id;
    private String username;
    private String password;
    private boolean enabled;
}
