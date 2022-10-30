package br.com.springbootbrasil.newservice.controller;

import br.com.springbootbrasil.bases.BaseController;
import br.com.springbootbrasil.domain.dto.CategoryDto;
import br.com.springbootbrasil.domain.mapper.CategoryMapper;
import br.com.springbootbrasil.domain.model.Category;
import br.com.springbootbrasil.domain.service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1/categories")
public class CategoryController extends BaseController<Category, CategoryDto> {

    private final CategoryService service;
    private final CategoryMapper mapper;

    public CategoryController(CategoryService service, CategoryMapper mapper) {
        super(service, mapper);
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping
    public List<CategoryDto> getAll() {
        return service.getAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

}
