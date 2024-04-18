package com.egvc.msproducts.services.impl;

import com.egvc.msproducts.commons.services.impl.AbstractGenericService;
import com.egvc.msproducts.dtos.ProductDTO;
import com.egvc.msproducts.persistence.entities.Product;
import com.egvc.msproducts.mapper.ProductMapper;
import com.egvc.msproducts.persistence.repositories.ProductRepository;

import com.egvc.msproducts.persistence.specifications.ProductSpecification;
import com.egvc.msproducts.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl extends AbstractGenericService<Product, ProductDTO, Long> implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    private static final String NOT_FOUND_MESSAGE = "Product not found";

    protected ProductServiceImpl(ProductRepository repository, ProductMapper mapper) {
        super(repository, mapper, NOT_FOUND_MESSAGE);
        this.productRepository = repository;
        this.productMapper = mapper;
    }

    @Override
    public List<ProductDTO> searchProducts(Map<String, Object> params) {

        var brand = getParam(params, "brand");
        var category = getParam(params, "category");

        var spec = new ProductSpecification(brand, category);

        return this.productRepository.findAll(spec).stream()
                .map(this.productMapper::toDto)
                .toList();
    }

    private Long getParam(Map<String, Object> params, String key) {
        return Long.parseLong(params.getOrDefault(key,0).toString());
    }
}
