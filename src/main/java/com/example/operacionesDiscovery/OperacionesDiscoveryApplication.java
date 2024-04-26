package com.example.operacionesDiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OperacionesDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(OperacionesDiscoveryApplication.class, args);
	}

}
