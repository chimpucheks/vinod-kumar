package com.aop.service;

import org.springframework.stereotype.Service;

import com.aop.entity.Product;

@Service
public class ProductService {

	public Product createProduct(String productName, int productId) {
		Product product = new Product();
		product.setProductName(productName);
		product.setProductId(productId);
		return product;
	}

	public void deleteProduct(int productId) {

	}

}
