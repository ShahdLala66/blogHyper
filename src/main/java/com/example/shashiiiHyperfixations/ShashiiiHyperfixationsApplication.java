package com.example.shashiiiHyperfixations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableJpaRepositories("com.example.shashiiiHyperfixations.repository")
@EntityScan("com.example.shashiiiHyperfixations.user, com.example.shashiiiHyperfixations.model")  // Ensure this matches your package
public class ShashiiiHyperfixationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShashiiiHyperfixationsApplication.class, args);
	}

}
