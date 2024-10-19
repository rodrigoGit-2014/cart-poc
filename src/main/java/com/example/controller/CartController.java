package com.example.controller;

import java.util.UUID;

import com.example.model.Cart;
import com.example.model.CartRequest;
import com.example.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/save_cart")
    public void saveCart(@RequestBody CartRequest request) {
        Cart datastoreCart = new Cart();
        datastoreCart.setCartId(request.getCartId());
        datastoreCart.setCartType(request.getCartType());
        cartService.saveCart(datastoreCart);
    }

    @GetMapping("/find_cart/{cartId}")
    public Cart findCart(@PathVariable UUID cartId) {
        return cartService.findCart(cartId);
    }
}

