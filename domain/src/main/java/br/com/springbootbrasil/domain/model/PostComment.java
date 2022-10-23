package br.com.springbootbrasil.domain.model;

import br.com.springbootbrasil.bases.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity(name = "post_comment")
@Data
public class PostComment extends BaseEntity {

    @ManyToOne
    private Post post;

    @ManyToOne
    private User user;

    @Column(nullable = false)
    private String content;
}
