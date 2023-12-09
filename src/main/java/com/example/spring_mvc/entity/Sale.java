package com.example.spring_mvc.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "Sale")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long slNo;

    private int salesmanID;

    @ManyToOne
    @JoinColumn(name = "prodID")
    private Product product;

    private String salesmanName;

    @Temporal(TemporalType.DATE)
    private Date dos;
}
