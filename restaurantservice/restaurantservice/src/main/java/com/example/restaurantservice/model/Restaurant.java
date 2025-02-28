package com.example.restaurantservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Restaurant {
    @Id
    private long id;
    private String name;
    private String address;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    //spring.security.user.password=Gourab@123
}