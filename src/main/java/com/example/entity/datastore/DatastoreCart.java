package com.example.entity.datastore;

import java.util.UUID;

import com.google.cloud.spring.data.datastore.core.mapping.Entity;
import lombok.Data;
import org.springframework.data.annotation.Id;


@Data
@Entity(name = "Cart")
public class DatastoreCart {
    @Id
    private UUID cartId;
    private String cartType;

}