package com.example.pacienteMesasUno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PacienteMesasUnoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PacienteMesasUnoApplication.class, args);
	}

	@GetMapping
	public String holaPaciente() {
		return "Hola paciente";
	}

}
