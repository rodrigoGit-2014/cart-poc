package com.example.repository.datastore;

import com.example.entity.datastore.DatastoreCart;
import com.example.mappers.CartMapper;
import com.example.model.Cart;
import com.example.repository.contract.ICartRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@AllArgsConstructor
@Repository
public class DataStoreCartRepository implements ICartRepository {
    private final DataStoreCartRepositoryProxy dataStoreCartRepositoryProxy;

    private final CartMapper mapper = CartMapper.INSTANCE;

    @Override
    public Cart saveCart() {
        DatastoreCart newCart = dataStoreCartRepositoryProxy.save(null);
        return mapper.toDomainDatastore(newCart);
    }
}
