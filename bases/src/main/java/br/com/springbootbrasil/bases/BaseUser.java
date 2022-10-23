package br.com.springbootbrasil.bases;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.List;

public interface BaseUser {
    String getId();
    String getUsername();
    String getPassword();
    List<String> getProfiles() throws JsonProcessingException;
}
