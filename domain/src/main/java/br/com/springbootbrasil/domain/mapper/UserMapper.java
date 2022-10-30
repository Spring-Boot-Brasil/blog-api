package br.com.springbootbrasil.domain.mapper;

import br.com.springbootbrasil.bases.BaseMapper;
import br.com.springbootbrasil.domain.dto.UserDto;
import br.com.springbootbrasil.domain.model.User;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface UserMapper extends BaseMapper<User, UserDto> {
}
