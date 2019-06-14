package com.billy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FamilyServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FamilyServerApplication.class, args);
	}

	@RequestMapping("/")
	public String hello(){
		return "hello billy!";
	}
}
