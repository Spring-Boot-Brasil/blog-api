package br.com.springbootbrasil.bases;

import javax.persistence.EntityManager;
import java.util.stream.Stream;

public abstract class BaseService<E extends BaseEntity> {

    private final EntityManager entityManager;
    private final BaseRepository<E> entityRepository;

    protected BaseService(EntityManager entityManager, BaseRepository<E> entityRepository) {
        this.entityManager = entityManager;
        this.entityRepository = entityRepository;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public E load(String id) {
        return entityRepository.getById(id);
    }

    public Stream<E> save(Stream<E> details) {
        return details.map(this::save);
    }

    public E save(E source) {
        return entityRepository.save(source);
    }

    public E update(E source) {
        return entityRepository.save(source);
    }

    public void kill(String id) {
        entityRepository.deleteById(id);
    }
}
