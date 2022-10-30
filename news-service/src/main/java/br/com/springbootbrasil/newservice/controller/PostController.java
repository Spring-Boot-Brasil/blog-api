package br.com.springbootbrasil.newservice.controller;

import br.com.springbootbrasil.bases.BaseController;
import br.com.springbootbrasil.domain.dto.PostDto;
import br.com.springbootbrasil.domain.mapper.PostMapper;
import br.com.springbootbrasil.domain.model.Post;
import br.com.springbootbrasil.domain.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1/posts")
public class PostController extends BaseController<Post, PostDto> {

    private final PostService postService;
    private final PostMapper postMapper;

    public PostController(PostService service, PostMapper mapper) {
        super(service, mapper);
        this.postService = service;
        this.postMapper = mapper;
    }

    @GetMapping("/destaques")
    public List<PostDto> getEmDestaques() {
        return postService.getEmDestaque()
                .stream()
                .map(postMapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/top-5-visualizadas")
    public List<PostDto> getTop5Visualizadas() {
        return postService.getTop5Visualizadas()
                .stream()
                .map(postMapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/top-5/by/category/{category_id}")
    public List<PostDto> getTop5PorCategoria(@PathVariable("category_id") String categoryId) {
        return postService.getTop5PorCategoria(categoryId)
                .stream()
                .map(postMapper::toDto)
                .collect(Collectors.toList());
    }

}
