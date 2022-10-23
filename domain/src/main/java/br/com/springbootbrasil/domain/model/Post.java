package br.com.springbootbrasil.domain.model;

import br.com.springbootbrasil.bases.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;

@Entity(name = "post")
@Data
public class Post extends BaseEntity {

    @JoinColumn(nullable = false)
    @ManyToOne
    private User author;

    @JoinColumn(nullable = false)
    @OneToOne
    private User reviewer;

    @Column(name = "short_url", nullable = false)
    private String shortUrl;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String subtitle;

    @Column(columnDefinition = "LONGTEXT", nullable = false)
    private String content;

    @Column(name = "banner_img", nullable = false)
    private String bannerImg;

    @Column(nullable = false)
    private Boolean reviewed;

    @Column
    private BigInteger views;
}
