package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.model.Product;
import com.capg.service.ProductService;

@RestController
@CrossOrigin(origins="*")
public class ProductController {

	@Autowired
	ProductService  productService;
	
	@GetMapping("product")
	public List<Product>  getAllProducts()
	{
		  return productService.findAllProducts();
	}
	
	@PostMapping("product")
	public Product  createProduct(@RequestBody Product product)
	{
		return  productService.createProduct(product);
	}
	
	
}
