package br.com.springbootbrasil.newservice.controller;

import br.com.springbootbrasil.domain.dto.CategoryDto;
import br.com.springbootbrasil.newservice.BaseMockTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.mockito.Mockito;
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

    @Test
    @DisplayName("Deveria testar se é cadastrado com sucesso uma categoria")
    void insertNewCategory() throws ParseException {

        var categoryDto = new CategoryDto();
        categoryDto.setTitle("JPA");

        var category = mappers.categoryMapper.toEntity(categoryDto);
        category.setId("413b1193-77ee-4c29-a6ae-f88b14e16af9");


        Mockito.when(repositories.categoryRepository.findByTitle("JPA"))
                .thenReturn(null);

        Mockito.when(repositories.categoryRepository.save(category))
                .thenReturn(category);


        var newCategoryDto = controllers.categoryController.create(categoryDto);
        var expectedDto = repositories.categoryDtoListSample01().get(0);

        Assertions.assertEquals(expectedDto, newCategoryDto);
    }

    @Test
    @DisplayName("Deveria testar erro ao inserir uma categoria existente")
    void insertNewCategoryWithError() {
        var categoryDto = new CategoryDto();
        categoryDto.setTitle("JPA");
        var category = mappers.categoryMapper.toEntity(categoryDto);
        category.setId("413b1193-77ee-4c29-a6ae-f88b14e16af9");

        Mockito.when(repositories.categoryRepository.findByTitle("JPA"))
                .thenReturn(category);


        var exception = Assertions.assertThrows(Exception.class, () -> {
            controllers.categoryController.create(categoryDto);
        });

        Assertions.assertEquals("Categoria existente", exception.getMessage());
    }
}
