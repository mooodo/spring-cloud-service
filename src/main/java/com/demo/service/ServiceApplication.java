/*
 * Created by 2020-05-03 19:49:05 
 */
package com.demo.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author fangang
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}

}
