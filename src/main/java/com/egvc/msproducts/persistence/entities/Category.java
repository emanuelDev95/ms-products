package com.egvc.msproducts.persistence.entities;

import com.egvc.msproducts.commons.entities.AbstractEntity;
import jakarta.persistence.*;
import lombok.*;


import java.io.Serializable;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity @Table(name = "categoria")

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Category  extends AbstractEntity<Long> implements Serializable {

    private String nombre;
    private String descripcion;
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Product> products;
}
