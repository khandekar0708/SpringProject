package com;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Product;

public interface ProductJpa extends JpaRepository<Product, Integer> {

}
