package com.capg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.model.Product;
import com.capg.repo.ProductRepo;
@Service
public class ProductService {
	@Autowired
	private  ProductRepo  productRepo;
	
	public List<Product> findAllProducts() {
		 
		return productRepo.findAll();
	}

	public Product createProduct(Product product) {
		
		return productRepo.saveAndFlush(product);
	}
 
}
