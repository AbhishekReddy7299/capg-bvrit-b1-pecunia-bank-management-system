package com.capg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_tbl")
public class Product {

	  @Id
	  @Column(name="productid")
	  @GeneratedValue
	  private int productId;
	  
	  @Column(name="productname",length=15)
	  private String productName;
	  
	  @Column(name="productprice")
	  private double price ;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	  
	  
}
