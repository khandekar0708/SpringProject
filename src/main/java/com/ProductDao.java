package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Product;

@Repository
public class ProductDao {
	
	@Autowired
	ProductJpa jpa;
	
	public Product saveProduct(Product p) {
		return jpa.save(p);
	}

}
