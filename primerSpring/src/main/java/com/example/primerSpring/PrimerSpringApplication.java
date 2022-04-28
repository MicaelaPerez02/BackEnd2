package com.example.primerSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PrimerSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimerSpringApplication.class, args);
	}

	@GetMapping
	public String holaMundo(){
		return "Hola Mundoo";
	}
}
