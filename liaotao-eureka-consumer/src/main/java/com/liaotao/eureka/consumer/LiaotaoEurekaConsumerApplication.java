package com.liaotao.eureka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@SpringBootApplication
@RestController
public class LiaotaoEurekaConsumerApplication {

	@Resource
	private RestTemplate restTemplate;

	public static void main(String[] args) {
		SpringApplication.run(LiaotaoEurekaConsumerApplication.class, args);
	}

	@RequestMapping("hello")
	public String hello(){
		return restTemplate.getForObject("http://localhost:8090/hello",String.class);
	}

}

