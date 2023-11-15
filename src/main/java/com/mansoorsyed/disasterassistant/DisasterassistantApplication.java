package com.mansoorsyed.disasterassistant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.mansoorsyed.disasterassistant")
@EnableAutoConfiguration
public class DisasterassistantApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisasterassistantApplication.class, args);
	}

}
