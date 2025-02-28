package com.example.OrderService.model;

import jakarta.persistence.Embeddable;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class OrderItem {
    private String productId;
    private String productName;
    private int quentity;
    private double price;
}
