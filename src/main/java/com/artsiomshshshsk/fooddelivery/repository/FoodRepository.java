package com.artsiomshshshsk.fooddelivery.repository;

import com.artsiomshshshsk.fooddelivery.domain.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food,Long> {
}
