package br.com.springbootbrasil.domain.repository;

import br.com.springbootbrasil.bases.BaseRepository;
import br.com.springbootbrasil.domain.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseRepository<User> {

}
