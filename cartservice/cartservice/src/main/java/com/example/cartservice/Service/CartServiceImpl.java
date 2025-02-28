package com.example.cartservice.Service;

import com.example.cartservice.Repository.CartRepository;
import com.example.cartservice.model.Cart;
import com.example.cartservice.model.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CartServiceImpl implements CartService{
    @Autowired
    private CartRepository cartRepository;

    @Override
    public Cart addItemtoCart(String userId, CartItem cartItem) {
        Cart cart=cartRepository.findByUserId(userId).orElse(new Cart(userId, new ArrayList<>(), 0.0));
        cartItem.setCart(cart);
        cart.getItems().add(cartItem);
        cart.setTotalPrice(cart.getTotalPrice() + cartItem.getPrice() * cartItem.getQuantity());
        return cartRepository.save(cart);
    }

    @Override
    public Cart removeItemToCart(String userID, Long itemId) {
        Cart cart=cartRepository.findByUserId(userID).orElseThrow(()-> new RuntimeException("Cart not Found"));
        cart.getItems().removeIf(item-> item.getId()==itemId);
        return cartRepository.save(cart);
    }

    @Override
    public Cart getCartByUserId(String userID) {
        return cartRepository.findByUserId(userID).orElseThrow(()->new RuntimeException("Cart not found")) ;
    }

    @Override
    public Cart clearCart(String userID) {
        Cart cart=cartRepository.findByUserId(userID).orElseThrow(()->new RuntimeException("Cart not found"));
        cart.getItems().clear();
        cart.setTotalPrice(0.0);
        return cartRepository.save(cart);
    }
}