package com.example.config;

import com.example.utils.Profiles;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Configuration
@Profile(Profiles.POSTGRES)
@EnableJpaRepositories(basePackages = "com.example.repository.postgres")
@ComponentScan(
        basePackages = "com.example.repository.postgres",
        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Repository.class),  // Include @Repository beans for PostgreSQL
        useDefaultFilters = false  // Disable default scanning and use explicit filters
)
public class PostgresConfig {
}
