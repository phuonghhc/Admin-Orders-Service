package com.mtumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import com.mtumer.email.EmailService;

@EnableEurekaClient
@SpringBootApplication
@EnableSwagger2
public class BackendApplication{

	
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
		System.out.println("the program is ready");
	}
	
	/*   @Override
	    public void run(String... args) throws Exception {
	        
	        service.sendEMail("1@gmail.com", "Test email", "Welcome to the springboot email");
	         
	        
	    }*/

}
