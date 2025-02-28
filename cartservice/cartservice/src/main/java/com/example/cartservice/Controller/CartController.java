package com.example.cartservice.Controller;

import com.example.cartservice.Service.CartService;
import com.example.cartservice.model.Cart;
import com.example.cartservice.model.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/{userId}/add")
    public Cart addItemtoCart(@PathVariable String userID, @RequestBody CartItem cartItem){
       return cartService.addItemtoCart(userID,cartItem);
    }

    @DeleteMapping("/{userId}/remove/{itemId}")
    public Cart removeItemToCart(@PathVariable String userID,@PathVariable Long itemId) {
        return cartService.removeItemToCart(userID, itemId);
    }

    @GetMapping("/{userId}")
    public Cart getCartByUserId(@PathVariable String userId){
        return cartService.getCartByUserId(userId);
    }

    public Cart clearCart(@PathVariable String userId ){
        return cartService.clearCart(userId);
    }
}
