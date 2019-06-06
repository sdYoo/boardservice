package com.web.boardservice;


import com.dto.PostsSaveRequestDto;
import com.web.boardservice.domain.posts.PostsRepository;
import com.web.boardservice.service.PostsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {

    private PostsRepository postsRepository;
    private PostsService postsService;


    public WebRestController(PostsRepository postsRepository) {
        this.postsRepository = postsRepository;
    }

    @GetMapping("/hello")
    public String hello() {

        return "HelloWorld";
    }

    @PostMapping("/posts")
    public Long savePosts(@RequestBody PostsSaveRequestDto dto){

        //postsRepository.save(dto.toEntity());
        return postsService.save(dto);
    }
}
