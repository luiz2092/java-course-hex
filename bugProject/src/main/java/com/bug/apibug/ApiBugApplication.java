package com.bug.apibug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableJms
@EnableSwagger2
public class ApiBugApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiBugApplication.class, args);
	}

}
