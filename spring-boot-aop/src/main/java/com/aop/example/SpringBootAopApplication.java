package com.aop.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class SpringBootAopApplication {

	public static void main(String[] args) {
		
		System.out.println("Product Application with AOP  ");
		System.out.println("Employee Application with AOP  ");
		SpringApplication.run(SpringBootAopApplication.class, args);
		System.out.println("Successfully  of Product AOP ");
		System.out.println("Successfully  of  Employee AOP ");
		
	}

}
