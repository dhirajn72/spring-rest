package com.example.demorest;

import com.example.controller.EmployeeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.controller," +
		"com.example.configuration,com.example.service.impl," +
		"com.example.dao,com.example.dao.impl,com.example.entity,com.example.service")
public class DemoRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRestApplication.class, args);
	}
}
