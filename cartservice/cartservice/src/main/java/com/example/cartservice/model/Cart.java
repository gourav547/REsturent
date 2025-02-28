package com.example.cartservice.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;


import java.util.Collection;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
    @Id
    private String UserID;

    @Setter
    @Getter
    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
    private List<CartItem> items;
    private double totalPrice;

}
