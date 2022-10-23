package br.com.springbootbrasil.domain.model;

import br.com.springbootbrasil.bases.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity(name = "post_category")
@Data
public class PostCategory extends BaseEntity {

    @ManyToOne
    private Post post;

    @ManyToOne
    private Category category;

}
