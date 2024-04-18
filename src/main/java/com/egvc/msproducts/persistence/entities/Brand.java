package com.egvc.msproducts.persistence.entities;

import com.egvc.msproducts.commons.entities.AbstractEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "brands")

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Brand extends AbstractEntity<Long> {

    private String name;
}
