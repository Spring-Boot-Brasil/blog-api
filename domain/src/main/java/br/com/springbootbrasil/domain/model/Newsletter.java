package br.com.springbootbrasil.domain.model;

import br.com.springbootbrasil.bases.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity(name = "newsletter")
@Data
public class Newsletter extends BaseEntity {

    @ManyToOne
    private User user;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private Boolean active;

}
