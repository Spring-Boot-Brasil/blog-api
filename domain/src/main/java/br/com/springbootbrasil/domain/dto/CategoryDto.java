package br.com.springbootbrasil.domain.dto;

import br.com.springbootbrasil.bases.BaseDto;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class CategoryDto extends BaseDto {
    private String title;
}
