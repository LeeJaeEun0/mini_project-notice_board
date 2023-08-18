package com.agile.demo.service;

import com.agile.demo.dto.CommentDto;
import com.agile.demo.dto.PostDto;
import com.agile.demo.model.CommentEntity;
import com.agile.demo.model.PostEntity;
import com.agile.demo.persistence.CommentRepository;
import com.agile.demo.persistence.PostReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class CommentService {
    @Autowired
    PostReposity postReposity;

    @Autowired
    CommentRepository commentRepository;

    public CommentEntity createComment(CommentDto commentDto){
        PostEntity postEntity = postReposity.getById(commentDto.getPostEntity());
        if(postEntity == null)
            return null;

        CommentEntity commentEntity = new CommentEntity();
        commentEntity.setNumber(commentDto.getNumber());
        commentEntity.setWriter(commentDto.getWriter());
        commentEntity.setPassword(commentDto.getPassword());
        commentEntity.setContext(commentDto.getContext());
        commentEntity.setSavedAt(LocalDateTime.now());
        commentEntity.setModifiedAt(LocalDateTime.now());
        commentEntity.setPostEntity(postEntity);
        commentEntity.setCommentRef(0);
        commentEntity.setCommentStep(0);
        commentEntity.setCommentLevel(0);
        return commentRepository.save(commentEntity);
    }

    public CommentEntity createSubComment(Long number,CommentDto commentDto){
        CommentEntity pCommentEntity = commentRepository.getById(number);

        CommentEntity commentEntity = new CommentEntity();
        commentEntity.setNumber(commentDto.getNumber());
        commentEntity.setWriter(commentDto.getWriter());
        commentEntity.setPassword(commentDto.getPassword());
        commentEntity.setContext(commentDto.getContext());
        commentEntity.setSavedAt(LocalDateTime.now());
        commentEntity.setModifiedAt(LocalDateTime.now());
        commentEntity.setCommentRef(pCommentEntity.getCommentRef()+1);
        commentEntity.setCommentStep(pCommentEntity.getCommentStep()+1);
        commentEntity.setCommentLevel(pCommentEntity.getCommentLevel()+1);
        return commentRepository.save(commentEntity);
    }


    public List<CommentEntity> getAllComment(){
        List<CommentEntity> commentEntities = commentRepository.findByDeleteAtIsNull();

        return commentEntities;
    }

    public List<CommentEntity> getComment(Long number){
        List<CommentEntity> commentEntities = commentRepository.findByPostEntity_NumberAndDeleteAtIsNull(number);

        return commentEntities;
    }

//    public List<CommentEntity> deleteComment(Long number){
//        List<CommentEntity> commentEntities = commentRepository.findByDeleteAtIsNull();
//
//        return commentEntities;
//    }


}
