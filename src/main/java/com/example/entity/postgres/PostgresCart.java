package com.example.entity.postgres;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "cart")
public class PostgresCart {

    @Id
    private UUID cartId;
    private String cartType;
}
