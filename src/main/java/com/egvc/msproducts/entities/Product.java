package com.egvc.msproducts.entities;

import com.egvc.msproducts.commons.entities.AbstractEntity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;


@EqualsAndHashCode(callSuper = true)
@Entity  @Table(name = "products")
@Builder
@Data @NoArgsConstructor @AllArgsConstructor

public class Product extends AbstractEntity<Long> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String name;
    private String description;
    private Double price;
    private String image;
    @ManyToOne
    private Category category;


}
