package br.com.springbootbrasil.newservice;

import br.com.springbootbrasil.domain.dto.CategoryDto;
import br.com.springbootbrasil.domain.mapper.CategoryMapper;
import br.com.springbootbrasil.domain.mapper.CategoryMapperImpl;
import br.com.springbootbrasil.domain.model.Category;
import br.com.springbootbrasil.domain.repository.CategoryRepository;
import br.com.springbootbrasil.domain.service.CategoryService;
import br.com.springbootbrasil.newservice.controller.CategoryController;
import org.mockito.Mockito;

import javax.persistence.EntityManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BaseMockTests {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public final Controller controllers = new Controller();
    public final Repository repositories = new Repository();
    public static final EntityManager em = Mockito.mock(EntityManager.class);

    public BaseMockTests() throws ParseException {
    }

    public static class Controller {
        public final CategoryController categoryController = new CategoryController(Service.categoryService, Mapper.categoryMapper);
    }

    public static class Service {
        public static final CategoryService categoryService = new CategoryService(em, Repository.categoryRepository);
    }

    public static class Repository {
        public static final CategoryRepository categoryRepository = Mockito.mock(CategoryRepository.class);

        public Repository() throws ParseException {
            Mockito.when(categoryRepository.findAll())
                    .thenReturn(categoryListSample01());
        }

        private List<Category> categoryListSample01() throws ParseException {
            var list = new ArrayList<Category>();

            // Category 01
            Category category1 = new Category();
            category1.setId("413b1193-77ee-4c29-a6ae-f88b14e16af9");
            category1.setCategory(null);
            category1.setTitle("JPA");
            category1.setCreatedAt(dateFormat.parse("2022-10-30 20:51:00"));
            category1.setUpdatedAt(dateFormat.parse("2022-10-30 20:51:00"));
            list.add(category1);

            return list;
        }

        public List<CategoryDto> categoryDtoListSample01() throws ParseException {
            return categoryListSample01()
                    .stream()
                    .map(Mapper.categoryMapper::toDto)
                    .collect(Collectors.toList());
        }
    }

    public static class Mapper {
        public static final CategoryMapper categoryMapper = new CategoryMapperImpl();
    }

}
