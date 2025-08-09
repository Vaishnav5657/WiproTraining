package com.wipro.apigatewat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ApigatewatApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApigatewatApplication.class, args);
	}

}

