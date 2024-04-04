package com.dbgrocerystore.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbgrocerystore.demo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    
}
