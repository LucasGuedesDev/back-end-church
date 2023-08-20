package com.apichurch;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(title = "Api Sistema de Controle de Igrejas", version = "3.0.1"),
		servers = {
				@Server(url = "http://localhost:8080")
		}
)
public class ChurchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChurchApplication.class, args);
	}
}
