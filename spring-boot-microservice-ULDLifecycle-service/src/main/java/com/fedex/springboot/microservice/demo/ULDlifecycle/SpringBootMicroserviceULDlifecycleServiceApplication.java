package com.fedex.springboot.microservice.demo.ULDlifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootMicroserviceULDlifecycleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroserviceULDlifecycleServiceApplication.class, args);
	}
}
