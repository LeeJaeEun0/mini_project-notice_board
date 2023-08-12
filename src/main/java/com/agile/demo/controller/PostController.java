package com.agile.demo.controller;

import com.agile.demo.dto.PostDto;
import com.agile.demo.model.PostEntity;
import com.agile.demo.persistence.PostReposity;
import com.agile.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public List<?> getPost(){
        List<PostEntity> postEntitys = postService.getAllPost();
        return postEntitys;
    }

    @PutMapping("/v1/post/{number}")
    public ResponseEntity<?> updatePost(@RequestBody PostDto postDto, @PathVariable Long number){
        PostEntity postEntity = postService.updatePost(postDto, number);
        return null;
    }

    @DeleteMapping("/v1/post/{number}")
    public ResponseEntity<?> deletePost(@PathVariable Long number){
        PostEntity postEntity = postService.deletePost(number);
        return null;
    }
}
