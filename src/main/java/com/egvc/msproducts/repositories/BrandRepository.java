package com.egvc.msproducts.repositories;

import com.egvc.msproducts.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}
