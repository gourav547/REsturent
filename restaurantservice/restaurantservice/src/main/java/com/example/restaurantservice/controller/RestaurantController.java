package com.example.restaurantservice.controller;

import com.example.restaurantservice.model.Restaurant;
import com.example.restaurantservice.repository.ResturentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
    @Autowired
    private ResturentRepository resturentRepository;

    @GetMapping
    public List<Restaurant> getAllRestaurants(){
        return resturentRepository.findAll();
    }

    @PostMapping
    public Restaurant creRestaurant(@RequestBody Restaurant restaurant){
        return resturentRepository.save(restaurant);
    }
}
