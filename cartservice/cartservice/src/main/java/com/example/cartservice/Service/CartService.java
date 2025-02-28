package com.example.cartservice.Service;

import com.example.cartservice.model.Cart;
import com.example.cartservice.model.CartItem;

public interface CartService {
    Cart addItemtoCart(String userID, CartItem cartItem);
    Cart removeItemToCart(String userID, Long itemId);
    Cart getCartByUserId(String userID);
    Cart clearCart(String userID);
}
