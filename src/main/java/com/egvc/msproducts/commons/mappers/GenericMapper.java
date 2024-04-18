package com.egvc.msproducts.commons.mappers;


public interface GenericMapper<D,E> {

    E toEntity(D dto);

    D toDto(E entity);

}