package com.egvc.msproducts.commons.mappers;


import com.egvc.msproducts.commons.entities.AbstractEntity;

public interface GenericMapper<D,E extends AbstractEntity> {

    E toEntity(D dto);

    D toDto(E entity);

}