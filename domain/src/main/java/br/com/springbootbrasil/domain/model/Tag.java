package br.com.springbootbrasil.domain.model;

import br.com.springbootbrasil.bases.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;

@Entity(name = "tag")
@Data
public class Tag extends BaseEntity {
    private String title;
}
