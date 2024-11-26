package com.wojduki.tickets_delivery_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TicketsDeliveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketsDeliveryServiceApplication.class, args);
	}

}
