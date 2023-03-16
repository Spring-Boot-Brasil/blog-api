package br.com.springbootbrasil.useraccount.domain.user;

import br.com.springbootbrasil.domain.dto.response.UserRegisterResponse;
import br.com.springbootbrasil.domain.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public ResponseEntity<UserRegisterResponse> create() {
        // TODO implementation
        return ResponseEntity.ok(null);
    }

}
