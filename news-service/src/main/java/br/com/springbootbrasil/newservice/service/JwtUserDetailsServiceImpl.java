package br.com.springbootbrasil.newservice.service;


import br.com.springbootbrasil.bases.security.JwtUserFactory;
import br.com.springbootbrasil.domain.repository.UserRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String uid) throws UsernameNotFoundException {
        var user = userRepository.findById(uid);
        if (user.isEmpty()) {
            throw new UsernameNotFoundException(String.format("No user found with UID '%s'.", uid));
        } else {
            try {
                return JwtUserFactory.create(user.get());
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }
    }
}