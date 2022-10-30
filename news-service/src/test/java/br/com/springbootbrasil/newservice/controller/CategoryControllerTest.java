package br.com.springbootbrasil.newservice.controller;

import br.com.springbootbrasil.newservice.BaseMockTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.text.ParseException;


@ExtendWith(MockitoExtension.class)
class CategoryControllerTest extends BaseMockTests {

    public CategoryControllerTest() throws ParseException {
    }

    @BeforeEach
    void init() {

    }

    @Test
    @DisplayName("Deveria testar o retorno de lista de Categorias")
    void getAll() throws ParseException {
        var getAllDtoSample = repositories.categoryDtoListSample01();
        Assertions.assertEquals(getAllDtoSample, controllers.categoryController.getAll());
    }
}
