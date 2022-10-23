package br.com.springbootbrasil.domain.usecases;

import br.com.springbootbrasil.domain.dto.request.UserLoginRequest;
import br.com.springbootbrasil.domain.dto.response.UserLoginResponse;
import br.com.springbootbrasil.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserLoginUseCase {

    private final UserRepository userRepository;

    public UserLoginUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserLoginResponse auth(UserLoginRequest userLoginRequest) {
        // TODO implementação
        return null;
    }

}
