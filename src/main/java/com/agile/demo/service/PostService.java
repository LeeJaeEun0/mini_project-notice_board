package com.agile.demo.service;

import com.agile.demo.dto.PostDto;
import com.agile.demo.model.PostEntity;
import com.agile.demo.persistence.PostReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {


    @Autowired
    PostReposity postReposity;

    public void postPost(PostDto postDto){
        PostEntity postEntity = new PostEntity();

    }

}
