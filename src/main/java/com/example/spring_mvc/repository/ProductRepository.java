package com.example.spring_mvc.repository;

import com.example.spring_mvc.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
