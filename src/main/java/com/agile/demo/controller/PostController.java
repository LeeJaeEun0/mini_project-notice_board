package com.agile.demo.controller;

import com.agile.demo.dto.PostDto;
import com.agile.demo.model.PostEntity;
import com.agile.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/posts")
public class PostController {

    @Autowired
    PostService postService;

    // Post - 게시글 작성
    @PostMapping
    public ResponseEntity<?> createPost(@RequestBody PostDto postDto){
        PostEntity postEntity = postService.createPost(postDto);

        return ResponseEntity.accepted().build();
    }

    // Get - 전체 글 조회
    @GetMapping
    public List<?> getAllPost(){
        List<PostEntity> postEntitys = postService.getAllPost();
        return postEntitys;
    }

    // Get - 한 개의 글 조회
    @GetMapping("/view/{number}")
    public Optional<PostEntity> getOnePost(@PathVariable Long number){
        Optional<PostEntity> postEntitys = postService.getOnePost(number);
        return postEntitys;
    }

    // Get - 검색하기
    @GetMapping("/{text}")
    public List<?> SearchPost(@PathVariable String text){
        List<PostEntity> postEntitys = postService.searchPost(text);
        return postEntitys;
    }

    // Patch - 게시글 수정하기
    @PatchMapping("/{number}")
    public ResponseEntity<?> updatePost(@RequestBody PostDto postDto, @PathVariable Long number){
        PostEntity postEntity = postService.updatePost(postDto, number);
        return ResponseEntity.ok(postEntity);

    }

    //Delete - 게시글 삭제하기
    @DeleteMapping("/{number}")
    public ResponseEntity<?> deletePost(@RequestBody PostDto postDto,@PathVariable Long number){
        PostEntity postEntity = postService.deletePost(postDto,number);
        return ResponseEntity.ok(postEntity);
    }
}
