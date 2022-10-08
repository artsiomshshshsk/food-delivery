package com.artsiomshshshsk.fooddelivery.controller;


import com.artsiomshshshsk.fooddelivery.assembler.FoodModelAssembler;
import com.artsiomshshshsk.fooddelivery.domain.Food;
import com.artsiomshshshsk.fooddelivery.service.FoodService;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.NoSuchElementException;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


@RequestMapping("/foodservice")
@RestController
public class FoodController {

    private final FoodService foodService;
    private final FoodModelAssembler foodModelAssembler;

    public FoodController(FoodService foodService, FoodModelAssembler foodModelAssembler) {
        this.foodService = foodService;
        this.foodModelAssembler = foodModelAssembler;
    }

    @GetMapping("/foods")
    public CollectionModel<EntityModel<Food>> all() {
        List<EntityModel<Food>> foods = foodService.listAllFood().stream()
                .map(foodModelAssembler::toModel)
                .toList();
        return CollectionModel.of(foods, linkTo(methodOn(FoodController.class).all()).withSelfRel());
    }

    @GetMapping("/foods/{id}")
    public EntityModel<Food> one(@PathVariable Long id){
        Food food = foodService.getFood(id)
                .orElseThrow(()->new NoSuchElementException("There is no such food"));
        return foodModelAssembler.toModel(food);
    }

}
