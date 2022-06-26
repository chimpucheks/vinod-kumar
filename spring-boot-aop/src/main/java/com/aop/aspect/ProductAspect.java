package com.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ProductAspect {

	@Before(value = "execution(* com.aop.service.ProductService.*(..)) and args(productName,productId)")
	public void beforeAdvice(JoinPoint joinPoint, String productName, int productId) {
		System.out.println("Before method:" + joinPoint.getSignature());

		System.out.println("Creating Product with name - " + productName + " and id - " + productId);
	}

	@After(value = "execution(* com.aop.service.ProductService.*(..)) and args(productName,productId)")
	public void afterAdvice(JoinPoint joinPoint, String productName, int productId) {
		System.out.println("After method:" + joinPoint.getSignature());

		System.out.println("Successfully created Product with name - " + productName + " and id - " + productId);
	}
}
