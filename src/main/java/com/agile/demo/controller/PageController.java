package com.agile.demo.controller;

import com.agile.demo.dto.PostDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PageController {

    @GetMapping("/input")
    public String showInputPage(Model model) {
        model.addAttribute("postDto", new PostDto());
        return "input"; // Thymeleaf 템플릿 이름
    }

    @GetMapping("/password/{number}")
    public String showPasswordPage(Model model, @PathVariable Integer number) {
        if (number == 1){ // 수정인 경우
            model.addAttribute("number", 1);
            model.addAttribute("postDto", new PostDto());
            return "password";
        } else if (number == 2) {// 삭제인 경우
            model.addAttribute("number", 2);
            model.addAttribute("postDto", new PostDto());
            return "password";
        }
            return "board"; // 수정 필요
    }
}
