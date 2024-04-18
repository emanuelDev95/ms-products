package com.egvc.msproducts.services.impl;

import com.egvc.msproducts.commons.services.impl.AbstractGenericService;
import com.egvc.msproducts.dtos.CategoryDto;
import com.egvc.msproducts.persistence.entities.Category;
import com.egvc.msproducts.mapper.CategoryMapper;
import com.egvc.msproducts.persistence.repositories.CategoryRepository;
import com.egvc.msproducts.services.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends AbstractGenericService<Category, CategoryDto, Long> implements CategoryService {

    private static final String NOT_FOUND_MESSAGE = "Category not found" ;

    protected CategoryServiceImpl(CategoryRepository repository, CategoryMapper mapper) {
        super(repository, mapper, NOT_FOUND_MESSAGE);
    }
}
