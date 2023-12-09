package com.example.spring_mvc.service.impl;

import com.example.spring_mvc.entity.Sale;
import com.example.spring_mvc.repository.SaleRepository;
import com.example.spring_mvc.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SaleServiceImpl implements SaleService {
    @Autowired
    private SaleRepository saleRepository;
    @Override
    public List<Sale> getAllSale() {
        return saleRepository.findAll();
    }
}
