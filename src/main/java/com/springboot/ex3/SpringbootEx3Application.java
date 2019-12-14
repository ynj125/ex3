package com.springboot.ex3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication(scanBasePackages = "com.springboot.ex3.controller")

public class SpringbootEx3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEx3Application.class, args);
	}

}
