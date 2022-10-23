package br.com.springbootbrasil.domain.repository;

import br.com.springbootbrasil.bases.BaseRepository;
import br.com.springbootbrasil.domain.model.Post;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends BaseRepository<Post> {

}
