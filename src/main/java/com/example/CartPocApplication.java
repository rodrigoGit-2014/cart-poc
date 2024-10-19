package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

//@SpringBootApplication(scanBasePackages = "com.example")
@SpringBootApplication

@ComponentScan(
		basePackages = "com.example.repository",
		excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Repository.class)
)
public class CartPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartPocApplication.class, args);
	}


}
