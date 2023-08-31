package com.agile.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class PageController {

    @GetMapping("/input")
    public String showInputPage() {
        return "input"; // Thymeleaf 템플릿 이름
    }

}
