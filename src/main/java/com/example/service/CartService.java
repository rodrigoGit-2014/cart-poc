package com.example.service;

import java.util.UUID;

import com.example.mappers.CartMapper;
import com.example.model.Cart;
import com.example.repository.contract.ICartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {


    @Autowired
    private ICartRepository cartRepository;

    private final CartMapper mapper = CartMapper.INSTANCE;

    public void saveCart(Cart datastoreCart) {
        cartRepository.saveCart();
    }

    public Cart findCart(UUID cartId) {
        return null;
    }
}