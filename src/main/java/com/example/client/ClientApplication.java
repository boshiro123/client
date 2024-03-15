package com.example.client;

import com.example.webservice.wsdl.LoginResp;
import com.example.webservice.wsdl.LoginResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}
//	@Bean
//	CommandLineRunner lookup(Client Client) {
//		return args -> {
//			String username = "123";
//			String passwrod = "123";
//
//			if (args.length > 0) {
//				username = args[0];
//				passwrod = args[0];
//			}
//			LoginResp response = Client.Login(username,passwrod);
//			System.err.println(response.getErrorCode());
//			System.err.println(response.getHeader());
//
//		};
//	}

}
