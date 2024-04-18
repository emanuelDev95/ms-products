package com.egvc.msproducts.mapper;

import com.egvc.msproducts.commons.mappers.GenericMapper;
import com.egvc.msproducts.dtos.CategoryDto;
import com.egvc.msproducts.entities.Category;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@AllArgsConstructor
public class CategoryMapper implements GenericMapper<CategoryDto, Category> {
    @Override
    public Category toEntity(CategoryDto dto) {
        var category = Category.builder()
                .nombre(dto.name())
                .build();
        if(Objects.nonNull(dto.id())){
            category.setId(dto.id());
        }
        return category;
    }

    @Override
    public CategoryDto toDto(Category entity) {
        return new CategoryDto(entity.getId(),
                entity.getNombre());
    }
}
