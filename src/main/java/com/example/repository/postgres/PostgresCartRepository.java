package com.example.repository.postgres;

import com.example.entity.postgres.PostgresCart;
import com.example.mappers.CartMapper;
import com.example.model.Cart;
import com.example.repository.contract.ICartRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@AllArgsConstructor
@Repository
public class PostgresCartRepository implements ICartRepository {

    @Autowired
    private PostgresCartRepositoryProxy postgresCartRepositoryProxy;

    private final CartMapper mapper = CartMapper.INSTANCE;

    @Override
    public Cart saveCart() {
        PostgresCart newCart = postgresCartRepositoryProxy.save(null);
        return mapper.toDomainPostgres(newCart);
    }
}
