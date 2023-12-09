package com.example.spring_mvc.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prodID;

    private String prodName;
    private String description;

    @Temporal(TemporalType.DATE)
    private Date dateOfManf;

    private double price;
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Sale> sales;
}
