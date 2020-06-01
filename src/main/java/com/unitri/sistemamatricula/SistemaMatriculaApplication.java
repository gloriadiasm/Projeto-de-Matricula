package com.unitri.sistemamatricula;

import com.unitri.sistemamatricula.model.Admin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SistemaMatriculaApplication {

	public static void main(String[] args) {

		Admin admin = new Admin(1L, "UNITRI", "unitri-uberlandia@asoec.com", "UNITRI2000");
		SpringApplication.run(SistemaMatriculaApplication.class, args);
	}

}
