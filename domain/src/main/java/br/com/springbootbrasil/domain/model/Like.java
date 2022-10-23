package br.com.springbootbrasil.domain.model;

import br.com.springbootbrasil.bases.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity(name = "like")
@Data
public class Like extends BaseEntity {
    @ManyToOne
    private User user;

    @ManyToOne
    private Post post;
}
