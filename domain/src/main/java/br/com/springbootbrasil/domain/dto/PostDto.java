package br.com.springbootbrasil.domain.dto;

import br.com.springbootbrasil.bases.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostDto extends BaseDto {
    private UserDto user;
    private UserDto reviewer;
    private String shortUrl;
    private String title;
    private String subtitle;
    private String content;
    private String bannerImg;
    private Boolean reviewed;
}
