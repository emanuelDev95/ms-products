package com.egvc.msproducts.repositories;

import com.egvc.msproducts.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
