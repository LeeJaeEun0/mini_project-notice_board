package com.agile.demo.controller;

import com.agile.demo.model.PostEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoardController {
    // 작성된 post를 list로 get
    @GetMapping("/v1/board")
    public List<PostEntity> getPost(){
        System.out.println("연결 성공 입니다");
        return null;
    }
}
