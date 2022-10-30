package br.com.springbootbrasil.bases.security;

import br.com.springbootbrasil.bases.BaseUser;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;

public class JwtUserFactory {

    public static <T extends BaseUser> JwtUser create(T user) throws JsonProcessingException {
        return new JwtUser(user.getId(), user.getUsername(), user.getPassword(), mapToGrantedAuthorities(user.getProfiles()));
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(List<String> profilesEnum) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        profilesEnum.forEach(profile -> authorities.add(new SimpleGrantedAuthority(profile)));
        return authorities;
    }

}
