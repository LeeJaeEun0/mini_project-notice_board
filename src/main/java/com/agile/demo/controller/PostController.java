package com.agile.demo.controller;

import com.agile.demo.dto.PostDto;
import com.agile.demo.model.PostEntity;
import com.agile.demo.persistence.PostReposity;
import com.agile.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping("/v1/post")
    public ResponseEntity<?> createPost(@RequestBody PostDto postDto){
        PostEntity postEntity = postService.createPost(postDto);

        return ResponseEntity.accepted().build();
    }

    @GetMapping("/v1/post")
    public List<?> GetPost(){
        List<PostEntity> postEntitys = postService.getAllPost();
        return postEntitys;
    }
}
