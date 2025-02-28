package com.example.cartservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String productId;
    private String productName;
    private int quantity;
    private double price;

    @ManyToOne
    @JoinColumn(name = "cart_Id")
    private Cart cart;
}
