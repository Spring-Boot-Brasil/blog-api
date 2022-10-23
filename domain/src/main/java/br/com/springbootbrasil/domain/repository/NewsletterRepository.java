package br.com.springbootbrasil.domain.repository;

import br.com.springbootbrasil.bases.BaseRepository;
import br.com.springbootbrasil.domain.model.Newsletter;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsletterRepository extends BaseRepository<Newsletter> {

}
