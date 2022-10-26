package br.com.springbootbrasil.domain.service;

import br.com.springbootbrasil.domain.dto.request.UserLoginRequest;
import br.com.springbootbrasil.domain.dto.response.UserLoginResponse;
import br.com.springbootbrasil.domain.dto.response.UserRegisterResponse;
import br.com.springbootbrasil.domain.model.User;
import br.com.springbootbrasil.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserLoginResponse auth(UserLoginRequest userLoginRequest) {
        // TODO implementação
        return null;
    }

    public UserRegisterResponse register(User entity) {
        // TODO implementação
        return null;
    }

}
