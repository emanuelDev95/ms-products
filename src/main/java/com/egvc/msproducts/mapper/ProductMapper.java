package com.egvc.msproducts.mapper;


import com.egvc.msproducts.commons.mappers.GenericMapper;
import com.egvc.msproducts.dtos.ProductDTO;
import com.egvc.msproducts.entities.Product;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class ProductMapper implements GenericMapper<ProductDTO, Product> {
    @Override
    public Product toEntity(ProductDTO dto) {
        var product = Product.builder()
                .name(dto.name())
                .description(dto.description())
                .price(dto.price())
                .image(dto.image())
                .build() ;
        if(Objects.nonNull(dto.id())){
            product.setId(dto.id());
        }
        return product;
    }

    @Override
    public ProductDTO toDto(Product entity) {
        return new ProductDTO(entity.getId(),entity.getName(), entity.getDescription(),
                entity.getPrice(), entity.getImage());
    }
}
