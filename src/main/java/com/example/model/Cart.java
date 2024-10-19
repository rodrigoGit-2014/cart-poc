package com.example.model;

import java.util.UUID;

import lombok.Data;


@Data
public class Cart {

    private UUID cartId;
    private String cartType;
}
