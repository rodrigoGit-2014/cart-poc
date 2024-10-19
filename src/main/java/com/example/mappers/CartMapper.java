package com.example.mappers;

import com.example.entity.datastore.DatastoreCart;
import com.example.entity.postgres.PostgresCart;
import com.example.model.Cart;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CartMapper {
    CartMapper INSTANCE = Mappers.getMapper(CartMapper.class);

    PostgresCart toEntityPostgres(Cart cart);

    Cart toDomainPostgres(PostgresCart entity);

    DatastoreCart toEntityDatastore(Cart cart);

    Cart toDomainDatastore(DatastoreCart entity);

}

