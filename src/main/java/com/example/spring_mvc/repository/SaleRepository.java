package com.example.spring_mvc.repository;

import com.example.spring_mvc.entity.Product;
import com.example.spring_mvc.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
