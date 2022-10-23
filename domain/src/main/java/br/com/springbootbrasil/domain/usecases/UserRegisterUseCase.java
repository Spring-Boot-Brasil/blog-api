package br.com.springbootbrasil.domain.usecases;

import br.com.springbootbrasil.domain.dto.response.UserRegisterResponse;
import br.com.springbootbrasil.domain.model.User;
import br.com.springbootbrasil.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterUseCase {

    private final UserRepository userRepository;

    public UserRegisterUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserRegisterResponse register(User entity) {
        // TODO implementação
        return null;
    }

}
