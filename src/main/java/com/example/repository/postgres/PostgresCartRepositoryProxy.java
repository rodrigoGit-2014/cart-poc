package com.example.repository.postgres;

import java.util.UUID;

import com.example.entity.postgres.PostgresCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostgresCartRepositoryProxy extends JpaRepository<PostgresCart, UUID> {
}