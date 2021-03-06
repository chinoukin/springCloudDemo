package com.chinoukin.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ConfigClientApplication {
	@Value("${foo}")
	String foo;

	@RequestMapping("/hi")
	public String hi(){
		return foo;
	}

	public static void main(String[] args) {
		System.out.println("haha");
		System.out.println("wwwwwwww");
		System.out.println("ffff99999");
		System.out.println("新东方");
		System.out.println("99888");
		System.out.println(true);
		SpringApplication.run(ConfigClientApplication.class, args);
	}
}
