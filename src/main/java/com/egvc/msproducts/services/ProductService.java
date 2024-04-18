package com.egvc.msproducts.services;

import com.egvc.msproducts.commons.services.GenericService;
import com.egvc.msproducts.dtos.ProductDTO;

import java.util.List;
import java.util.Map;

public interface ProductService extends GenericService<ProductDTO, Long> {

     List<ProductDTO> searchProducts(Map<String , Object> params);
}
