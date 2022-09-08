package com.example.backendclase22entrenador;

import com.example.backendclase22entrenador.dao.BDH2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendClase22EntrenadorApplication {

	public static void main(String[] args) {
		BDH2.cargarBD();
		SpringApplication.run(BackendClase22EntrenadorApplication.class, args);
	}

}
