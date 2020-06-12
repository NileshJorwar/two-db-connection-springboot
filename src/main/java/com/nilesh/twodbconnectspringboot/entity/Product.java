package com.nilesh.twodbconnectspringboot.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "product")
public class Product {
    @Id
    private long id;
    private String nameOfProduct;
    private long price;
    public Product(String nameOfProduct, long price){
        this.nameOfProduct=nameOfProduct;
        this.price = price;
    }
}
