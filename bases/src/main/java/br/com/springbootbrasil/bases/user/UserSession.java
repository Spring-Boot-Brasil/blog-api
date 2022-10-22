package br.com.springbootbrasil.bases.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserSession {
    String username;
    String token;
}
