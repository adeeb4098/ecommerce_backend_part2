package com.ecommerce_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan(basePackages = "com.model")
public class EcommerceBackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(EcommerceBackendApplication.class, args);
	}
}

