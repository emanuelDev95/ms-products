package com.egvc.msproducts.persistence.specifications;

import com.egvc.msproducts.persistence.entities.Brand;
import com.egvc.msproducts.persistence.entities.Category;
import com.egvc.msproducts.persistence.entities.Product;
import jakarta.persistence.criteria.*;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.NonNull;

import java.util.ArrayList;
import java.util.List;

public class ProductSpecification implements Specification<Product> {

    private final Long brand;
    private final Long category;

    public ProductSpecification(Long brand, Long category) {
        this.brand = brand;
        this.category = category;
    }

    @Override
    public Predicate toPredicate(@NonNull  Root<Product> root, @NonNull CriteriaQuery<?>  query, @NonNull CriteriaBuilder cb) {
        List<Predicate> predicates = new ArrayList<>();

        if (brand != 0) {
            Join<Product, Brand> brandJoin = root.join("brand");
            predicates.add(cb.equal(brandJoin.get("id"), brand));
        }

        if (category != 0) {
            Join<Product, Category> categoryJoin = root.join("category");
            predicates.add(cb.equal(categoryJoin.get("id"), category));
        }

        return cb.and(predicates.toArray(new Predicate[0]));
    }
}
