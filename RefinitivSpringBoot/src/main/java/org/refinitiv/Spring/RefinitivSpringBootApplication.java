package org.refinitiv.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

//Annotation to enable Swagger
@EnableSwagger2

//packages to scan to consider beans to be managed by Spring
@ComponentScan(basePackages = "org.refinitiv.Spring")

@SpringBootApplication
public class RefinitivSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RefinitivSpringBootApplication.class, args);
	}

}
