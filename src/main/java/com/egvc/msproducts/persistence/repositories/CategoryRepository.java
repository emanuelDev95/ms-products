package com.egvc.msproducts.persistence.repositories;

import com.egvc.msproducts.persistence.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
