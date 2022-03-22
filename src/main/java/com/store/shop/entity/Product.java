package com.store.shop.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="products")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Product implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    @NotNull private String designation;
    @NotNull private String description;
    @NotNull private double price;
    private String photo;
    private boolean promotion; 
    private boolean selected; 
    @NotNull private int quantity;
    @NotNull private double tva;

    // MANY TO ONE RELATION
    @ManyToOne
    @JoinColumn(name="categoryId")
    private Category category;
    
}
