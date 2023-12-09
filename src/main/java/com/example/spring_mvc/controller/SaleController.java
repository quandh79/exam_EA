package com.example.spring_mvc.controller;

import com.example.spring_mvc.entity.Product;
import com.example.spring_mvc.entity.Sale;
import com.example.spring_mvc.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/sale")
public class SaleController {
    @Autowired
    private SaleService saleService;
    @GetMapping("/getAll")
    public String getAll(ModelMap modelMap) {
        String view = "listSale";
        try {
            List<Sale> sales = saleService.getAllSale();
            modelMap.addAttribute("sales", sales);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return view;
    }
}
