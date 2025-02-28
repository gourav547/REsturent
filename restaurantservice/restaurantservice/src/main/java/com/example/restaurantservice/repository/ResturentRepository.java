package com.example.restaurantservice.repository;

import com.example.restaurantservice.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResturentRepository extends JpaRepository<Restaurant, Long> {
}
