package br.com.springbootbrasil.model;

import br.com.springbootbrasil.bases.BaseEntity;
import br.com.springbootbrasil.bases.BaseUser;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

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

    public String getId() {
        return null;
    }

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
    public List<String> getProfiles() throws JsonProcessingException {
        var objectMapper = new ObjectMapper();
        return objectMapper.readValue(profiles, new TypeReference<>() {});
    }
}
