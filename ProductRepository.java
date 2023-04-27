package com.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}