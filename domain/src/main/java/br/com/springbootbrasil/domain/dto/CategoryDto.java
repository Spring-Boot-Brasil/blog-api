package br.com.springbootbrasil.domain.dto;

import br.com.springbootbrasil.bases.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryDto extends BaseDto {
    private String title;
}
