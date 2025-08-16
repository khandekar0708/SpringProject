package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	ProductService ps;
	
	@PostMapping("/create")
	public ResponseEntity<ResponseStructure<Product>> saveProduct(@RequestBody Product p) {
		return ps.createProduct(p);
		
		
	}
	
	

}
