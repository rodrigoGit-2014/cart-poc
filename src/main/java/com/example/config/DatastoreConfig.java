package com.example.config;

import com.example.utils.Profiles;
import com.google.cloud.spring.data.datastore.repository.config.EnableDatastoreRepositories;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Configuration
@Profile(Profiles.DATASTORE)
@EnableDatastoreRepositories(basePackages = "com.example.repository.datastore")
@ComponentScan(
        basePackages = "com.example.repository.datastore",
        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Repository.class),
        useDefaultFilters = false
)
public class DatastoreConfig {
}
