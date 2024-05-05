package com.example.lmsgatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//disable firewall or it might not work
@SpringBootApplication
public class LmsGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LmsGatewayServerApplication.class, args);
	}

}
