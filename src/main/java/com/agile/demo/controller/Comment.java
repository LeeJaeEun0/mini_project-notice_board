package com.agile.demo.controller;

import com.agile.demo.dto.CommentDto;
import com.agile.demo.model.CommentEntity;
import com.agile.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/comments")
public class Comment {
    @Autowired
    CommentService commentService;

    @PostMapping
    public ResponseEntity<?> createComment(@RequestBody CommentDto commentDto){
        CommentEntity commentEntity = commentService.createComment(commentDto);
        return ResponseEntity.accepted().build();
    }

    @PostMapping("/{number}")
    public ResponseEntity<?> createSubComment(@PathVariable Long number, @RequestBody CommentDto commentDto){
        CommentEntity commentEntity = commentService.createSubComment(number,commentDto);
        return ResponseEntity.accepted().build();
    }

    @GetMapping
    public List<?> getAllComment(){
        List<CommentEntity> comments = commentService.getAllComment();
        return comments;
    }

    @GetMapping("/{number}")
    public List<?> getComment(@PathVariable Long number){
        List<CommentEntity> comments = commentService.getComment(number);
        return comments;
    }
}
