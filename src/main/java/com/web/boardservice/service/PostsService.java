package com.web.boardservice.service;

import com.dto.PostsSaveRequestDto;
import com.web.boardservice.domain.posts.PostsRepository;
import lombok.AllArgsConstructor;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class PostsService {
    private PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto dto){
        System.out.println("Long save() init! ");
        System.out.println("title: "+dto.getTitle());
        return postsRepository.save(dto.toEntity()).getId();
    }
}
