package br.com.springbootbrasil.domain.model;

import br.com.springbootbrasil.bases.BaseEntity;
import br.com.springbootbrasil.bases.BaseUser;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.SneakyThrows;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.List;

@Entity(name = "user")
@Data
public class User extends BaseEntity implements BaseUser {

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column
    private String image;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(name = "profiles", columnDefinition = "JSON", nullable = false)
    private String profiles;

    @JsonIgnore
    @Override
    public String getUsername() {
        return username;
    }

    @JsonIgnore
    @Override
    public String getPassword() {
        return password;
    }

    @Override
    @SneakyThrows
    public List<String> getProfiles() {
        var objectMapper = new ObjectMapper();
        return objectMapper.readValue(profiles, new TypeReference<>() {});
    }
}
