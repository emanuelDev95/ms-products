package com.egvc.msproducts.commons.entities;

import jakarta.persistence.*;
import lombok.Data;

@MappedSuperclass
@Data
public abstract class AbstractEntity<K> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private K id;
}
