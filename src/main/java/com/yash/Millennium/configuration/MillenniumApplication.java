package com.yash.Millennium.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.yash.Millennium")
public class MillenniumApplication {
	public static void main(String[] args) {
		SpringApplication.run(MillenniumApplication.class, args);
	}
}
