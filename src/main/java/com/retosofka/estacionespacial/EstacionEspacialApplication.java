package com.retosofka.estacionespacial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class EstacionEspacialApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstacionEspacialApplication.class, args);

	}

}
