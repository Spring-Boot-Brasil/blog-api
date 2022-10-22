package br.com.springbootbrasil.bases;

import org.mapstruct.Mapping;

public interface BaseMapper<E extends BaseEntity, D extends BaseDto> {
    D toDto(E entity);

    @Mapping(target = "id", ignore = true)
    E toEntity(String id);

    @Mapping(target = "id", ignore = true)
    E toEntity(D dto);
}
