package br.com.springbootbrasil.bases;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public abstract class BaseController<E extends BaseEntity, D extends BaseDto> implements BaseResource<D> {

    public final BaseService<E> entityService;
    public final BaseMapper<E, D> entityMapper;

    public BaseController(BaseService<E> entityService, BaseMapper<E, D> entityMapper) {
        this.entityService = entityService;
        this.entityMapper = entityMapper;
    }

    enum CrudOperation {
        CREATE, UPDATE
    }

    @Override
    public D create(D detail) {
        return save(detail, CrudOperation.CREATE);
    }

    @Override
    public D update(String id, D detail) {
        detail.setId(id);
        return save(detail, CrudOperation.UPDATE);
    }

    @Override
    public D get(String id) {
        var target = entityService.load(id);
        return entityMapper.toDto(target);
    }

    @Override
    public void delete(String id) {
        entityService.kill(id);
    }

    protected D save(D detail, CrudOperation crudOperation) {
        var source = entityMapper.toEntity(detail);
        E target = null;

        switch (crudOperation) {
            case CREATE:
                target = entityService.save(source);
                break;
            case UPDATE:
                target = entityService.update(source);
                break;
        }

        return entityMapper.toDto(target);

    }
}
