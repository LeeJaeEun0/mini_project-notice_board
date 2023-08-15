package com.agile.demo.service;

import com.agile.demo.dto.CommentDto;
import com.agile.demo.dto.PostDto;
import com.agile.demo.model.CommentEntity;
import com.agile.demo.model.PostEntity;
import com.agile.demo.persistence.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CommentService {
    @Autowired
    CommentRepository commentRepository;

    public CommentEntity createComment(CommentDto commentDto){
        CommentEntity commentEntity = new CommentEntity();
        commentEntity.setNumber(commentDto.getNumber());
        commentEntity.setWriter(commentDto.getWriter());
        commentEntity.setPassword(commentDto.getPassword());
        commentEntity.setContext(commentDto.getContext());
        commentEntity.setSavedAt(LocalDateTime.now());
        commentEntity.setModifiedAt(LocalDateTime.now());
        commentEntity.setCommentRef(1);
        commentEntity.setCommentStep(1);
        commentEntity.setCommentLevel(1);
        return commentRepository.save(commentEntity);
    }

    public CommentEntity createComments(CommentDto commentDto){
        CommentEntity commentEntity = new CommentEntity();
        commentEntity.setNumber(commentDto.getNumber());
        commentEntity.setWriter(commentDto.getWriter());
        commentEntity.setPassword(commentDto.getPassword());
        commentEntity.setContext(commentDto.getContext());
        commentEntity.setSavedAt(LocalDateTime.now());
        commentEntity.setModifiedAt(LocalDateTime.now());
        commentEntity.setCommentRef(1);
        commentEntity.setCommentStep(1);
        commentEntity.setCommentLevel(1);
        return commentRepository.save(commentEntity);
    }

//    public List<CommentEntity> createComment(CommentDto commentDto){
//        List<CommentEntity> commentEntity = commentRepository.findallBy
//        return commentRepository.save(commentEntity);
//    }
}
