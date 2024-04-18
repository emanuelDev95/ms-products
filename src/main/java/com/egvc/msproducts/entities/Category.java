package com.egvc.msproducts.entities;

import com.egvc.msproducts.commons.entities.AbstractEntity;
import jakarta.persistence.*;
import lombok.*;


import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Entity @Table(name = "categoria")

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Category  extends AbstractEntity<Long> implements Serializable {

    private String nombre;
}
