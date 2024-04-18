package com.egvc.msproducts.services.impl;

import com.egvc.msproducts.commons.services.impl.AbstractGenericService;
import com.egvc.msproducts.dtos.ProductDTO;
import com.egvc.msproducts.entities.Product;
import com.egvc.msproducts.mapper.ProductMapper;
import com.egvc.msproducts.repositories.ProductRepository;

import com.egvc.msproducts.services.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends AbstractGenericService<Product, ProductDTO, Long> implements ProductService {

    private static final String NOT_FOUND_MESSAGE = "Product not found";

    protected ProductServiceImpl(ProductRepository repository, ProductMapper mapper) {
        super(repository, mapper, NOT_FOUND_MESSAGE);
    }
}
