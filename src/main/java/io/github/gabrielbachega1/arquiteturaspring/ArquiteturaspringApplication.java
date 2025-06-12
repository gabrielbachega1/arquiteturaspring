package io.github.gabrielbachega1.arquiteturaspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ArquiteturaspringApplication {

	public static void main(String[] args) {
		// SpringApplication.run(ArquiteturaspringApplication.class, args);

		SpringApplicationBuilder builder = new SpringApplicationBuilder(ArquiteturaspringApplication.class);

		builder.run(args);
	}
}
