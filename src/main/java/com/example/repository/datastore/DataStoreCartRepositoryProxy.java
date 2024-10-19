package com.example.repository.datastore;

import java.util.UUID;

import com.example.entity.datastore.DatastoreCart;
import com.google.cloud.spring.data.datastore.repository.DatastoreRepository;


public interface DataStoreCartRepositoryProxy extends DatastoreRepository<DatastoreCart, UUID> {
}