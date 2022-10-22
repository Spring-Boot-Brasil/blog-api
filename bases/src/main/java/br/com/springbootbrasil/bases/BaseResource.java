package br.com.springbootbrasil.bases;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

public interface BaseResource<D extends BaseDto> {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    D create(@Valid @RequestBody D detail);

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    D update(@PathVariable String id, @Valid @RequestBody D detail);

    @GetMapping("/{id}")
    D get(@PathVariable String id);

    @DeleteMapping("/{id}")
    void delete(@PathVariable String id);
}
