package com.egvc.msproducts.services.impl;

import com.egvc.msproducts.commons.services.impl.AbstractGenericService;
import com.egvc.msproducts.dtos.BrandDto;
import com.egvc.msproducts.entities.Brand;
import com.egvc.msproducts.mapper.BrandMapper;
import com.egvc.msproducts.repositories.BrandRepository;
import com.egvc.msproducts.services.BrandService;;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl extends AbstractGenericService<Brand, BrandDto, Long> implements BrandService {

    private static final String NOT_FOUND_MESSAGE = "Brand not found";

    protected BrandServiceImpl(BrandRepository repository, BrandMapper mapper ){
        super(repository, mapper, NOT_FOUND_MESSAGE);
    }
}
