package com.web.boardservice;

import com.dto.PostsSaveRequestDto;
import com.web.boardservice.domain.posts.PostsRepository;
import com.web.boardservice.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsRepository postsRepository;
    private PostsService postsService;

    //아래 생성자 주석 후 AllArgsConstructor 입력 시 정상적으로 저장됨
    //public WebRestController(PostsRepository postsRepository) {
    //    this.postsRepository = postsRepository;
    //}

    @GetMapping("/hello")
    public String hello() {
        System.out.println("hello!");
        return "HelloWorld";
    }

    @PostMapping("/posts")
    public Long savePosts(@RequestBody PostsSaveRequestDto dto){

        //postsRepository.save(dto.toEntity());
        System.out.println("savePosts!");
        return postsService.save(dto);
    }

    @GetMapping("/getTest")
    public String geoTest() {
        System.out.println("geoTest!");
        return "geoTest!";
    }
}
