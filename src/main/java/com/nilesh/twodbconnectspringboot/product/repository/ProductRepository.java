package com.nilesh.twodbconnectspringboot.product.repository;

import com.nilesh.twodbconnectspringboot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
