package br.com.springbootbrasil.domain.repository;

import br.com.springbootbrasil.bases.BaseRepository;
import br.com.springbootbrasil.domain.model.Category;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends BaseRepository<Category> {
    @Query(value = "SELECT c FROM category c WHERE LOWER(c.title) = LOWER(:title) ")
    Category findByTitle(@Param("title") String title);
}
