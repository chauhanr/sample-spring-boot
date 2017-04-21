package com.hcl.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SampleSpringBootApplication {
	
	@RequestMapping("/home")
	public String home() {
        return "Hello World Spring Boot App";
    }

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringBootApplication.class, args);
	}
}
