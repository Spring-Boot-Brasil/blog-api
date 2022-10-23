package br.com.springbootbrasil.domain.model;

import br.com.springbootbrasil.bases.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity(name = "newsletter_fav_category")
@Data
public class NewsletterFavCategory extends BaseEntity {

    @ManyToOne
    private Newsletter newsletter;

    @ManyToOne
    private Category category;

}
