package com.agile.demo.controller;

import com.agile.demo.dto.PostDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PageController {

    @GetMapping("/input")
    public String showInputPage(Model model) {
        model.addAttribute("postDto", new PostDto());
        return "input"; // Thymeleaf 템플릿 이름
    }

}
