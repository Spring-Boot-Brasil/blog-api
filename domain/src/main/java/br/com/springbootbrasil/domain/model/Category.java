package br.com.springbootbrasil.domain.model;

import br.com.springbootbrasil.bases.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "category")
@Data
public class Category extends BaseEntity {

    @ManyToOne
    private Category category;

    @Column(nullable = false)
    private String title;
}
