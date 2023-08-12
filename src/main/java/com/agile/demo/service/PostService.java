package com.agile.demo.service;

import com.agile.demo.dto.PostDto;
import com.agile.demo.model.PostEntity;
import com.agile.demo.persistence.PostReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {


    @Autowired
    PostReposity postReposity;

    public PostEntity createPost(PostDto postDto){
        PostEntity postEntity = new PostEntity();
        postEntity.setNumber(postDto.getNumber());
        postEntity.setTitle(postDto.getTitle());
        postEntity.setContext(postDto.getContext());
        postEntity.setWriter(postDto.getWriter());
        postEntity.setPassword(postDto.getPassword());

        return postReposity.save(postEntity);
    }

    public List<PostEntity> getAllPost() {
        List<PostEntity> postEntities = postReposity.findAll();
        return postEntities;
    }
}
