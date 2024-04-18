package com.egvc.msproducts.repositories;


import com.egvc.msproducts.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
