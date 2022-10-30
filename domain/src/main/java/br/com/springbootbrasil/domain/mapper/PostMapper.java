package br.com.springbootbrasil.domain.mapper;

import br.com.springbootbrasil.bases.BaseMapper;
import br.com.springbootbrasil.domain.dto.PostDto;
import br.com.springbootbrasil.domain.model.Post;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring",
        uses = UserMapper.class
)
public interface PostMapper extends BaseMapper<Post, PostDto> {

}
