package com.egvc.msproducts.persistence.repositories;

import com.egvc.msproducts.persistence.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}
