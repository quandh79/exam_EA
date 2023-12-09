package com.example.spring_mvc.service.impl;

import com.example.spring_mvc.entity.Product;
import com.example.spring_mvc.repository.ProductRepository;
import com.example.spring_mvc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
}
