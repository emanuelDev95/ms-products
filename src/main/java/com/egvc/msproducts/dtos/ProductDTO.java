package com.egvc.msproducts.dtos;

public record ProductDTO (
        Long id,
        String name,
        String description,
        Double price,
        String image,
        CategoryDto category) {
}
