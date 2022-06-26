package com.aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aop.entity.Product;
import com.aop.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/add/product", method = RequestMethod.GET)
	public Product addProduct(@RequestParam("productName") String productName,
			@RequestParam("productId") int productId) {

		return productService.createProduct(productName, productId);

	}

	@RequestMapping(value = "/remove/product", method = RequestMethod.GET)
	public String removeProduct(@RequestParam("productId") int productId) {

		productService.deleteProduct(productId);

		return "Product removed";
	}

}
