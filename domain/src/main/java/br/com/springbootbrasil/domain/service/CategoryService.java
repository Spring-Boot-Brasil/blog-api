package br.com.springbootbrasil.domain.service;

import br.com.springbootbrasil.bases.BaseService;
import br.com.springbootbrasil.domain.model.Category;
import br.com.springbootbrasil.domain.repository.CategoryRepository;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class CategoryService extends BaseService<Category> {

    private final CategoryRepository repository;

    public CategoryService(EntityManager entityManager, CategoryRepository repository) {
        super(entityManager, repository);
        this.repository = repository;
    }

    public List<Category> getAll() {
        return repository.findAll();
    }

    @Override
    @SneakyThrows
    public Category save(Category source) {
        if (repository.findByTitle(source.getTitle()) != null) {
            throw new Exception("Categoria existente");
        }
        return super.save(source);
    }
}
