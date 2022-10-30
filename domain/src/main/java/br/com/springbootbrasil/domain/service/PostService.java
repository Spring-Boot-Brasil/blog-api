package br.com.springbootbrasil.domain.service;

import br.com.springbootbrasil.bases.BaseService;
import br.com.springbootbrasil.domain.model.Post;
import br.com.springbootbrasil.domain.repository.PostRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.Collections;
import java.util.List;

@Service
public class PostService extends BaseService<Post> {

    protected PostService(EntityManager entityManager, PostRepository repository) {
        super(entityManager, repository);
    }

    public List<Post> getEmDestaque() {
        return Collections.emptyList();
    }

    public List<Post> getTop4Visualizadas() {
        return Collections.emptyList();
    }

}
