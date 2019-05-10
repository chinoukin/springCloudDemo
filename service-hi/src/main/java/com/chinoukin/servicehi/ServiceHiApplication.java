package com.chinoukin.servicehi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
@SpringBootApplication
public class ServiceHiApplication {
	@Value("${server.port}")
	String port;

	@RequestMapping("/hi")
	public String home(@RequestParam(defaultValue = "") String name){
		System.out.println("hi "+name+", I am from port:" + port + "\n");
		return "hi "+name+", I am from port:" + port;
	}

	@RequestMapping(value = "/hi2",method= RequestMethod.POST)
	public String home(@RequestBody User user){
		return "hi "+user.getName()+", I am from port:" + port;
	}

	public static void main(String[] args) {
		SpringApplication.run(ServiceHiApplication.class, args);
	}
}
