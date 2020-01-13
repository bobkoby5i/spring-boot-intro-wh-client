package com.koby5i.whclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
//import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WhClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhClientApplication.class, args);
		System.out.println("Hello World");
	}
}
