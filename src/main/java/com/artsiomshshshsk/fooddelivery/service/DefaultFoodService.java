package com.artsiomshshshsk.fooddelivery.service;

import com.artsiomshshshsk.fooddelivery.domain.Food;
import com.artsiomshshshsk.fooddelivery.repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DefaultFoodService implements FoodService{
    private final FoodRepository foodRepository;


    public  DefaultFoodService(FoodRepository foodRepository){
        this.foodRepository = foodRepository;
    }

    @Override
    public List<Food> listAllFood() {
        return foodRepository.findAll();
    }

    @Override
    public Optional<Food> getFood(long id) {
        return foodRepository.findById(id);
    }
}
