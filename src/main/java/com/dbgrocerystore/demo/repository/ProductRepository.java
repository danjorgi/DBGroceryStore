package com.dbgrocerystore.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbgrocerystore.demo.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByNameContainingIgnoreCase(String keyword);
    List<Product> findByCategoryIgnoreCase(String category);

    void deleteById(int productId);
}
