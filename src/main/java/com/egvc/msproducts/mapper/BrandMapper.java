package com.egvc.msproducts.mapper;

import com.egvc.msproducts.commons.mappers.GenericMapper;
import com.egvc.msproducts.dtos.BrandDto;
import com.egvc.msproducts.persistence.entities.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@AllArgsConstructor
public class BrandMapper implements GenericMapper<BrandDto, Brand> {

    @Override
    public Brand toEntity(BrandDto dto) {
        var brand = Brand.builder()
                .name(dto.name())
                .build();

        if(Objects.nonNull(dto.id())){
            brand.setId(dto.id());
        }
        return brand;
    }

    @Override
    public BrandDto toDto(Brand entity) {
        return new BrandDto(entity.getId(),entity.getName());
    }
}
