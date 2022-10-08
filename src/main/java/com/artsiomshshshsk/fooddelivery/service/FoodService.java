package com.artsiomshshshsk.fooddelivery.service;


import com.artsiomshshshsk.fooddelivery.domain.Food;

import java.util.List;
import java.util.Optional;


public interface FoodService {
    public List<Food> listAllFood();

    Optional<Food> getFood(long id);
}
