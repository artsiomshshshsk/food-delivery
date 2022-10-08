package com.artsiomshshshsk.fooddelivery.assembler;

import com.artsiomshshshsk.fooddelivery.controller.FoodController;
import com.artsiomshshshsk.fooddelivery.domain.Food;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;


import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class FoodModelAssembler implements RepresentationModelAssembler<Food, EntityModel<Food>> {
    @Override
    public EntityModel<Food> toModel(Food food) {
        return EntityModel.of(food,
                linkTo(methodOn(FoodController.class).one(food.getId())).withSelfRel(),
                linkTo(methodOn(FoodController.class).all()).withRel("foods"));
    }
}
