package br.com.springbootbrasil.domain.mapper;

import br.com.springbootbrasil.bases.BaseMapper;
import br.com.springbootbrasil.domain.dto.CategoryDto;
import br.com.springbootbrasil.domain.model.Category;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface CategoryMapper extends BaseMapper<Category, CategoryDto> {

}
