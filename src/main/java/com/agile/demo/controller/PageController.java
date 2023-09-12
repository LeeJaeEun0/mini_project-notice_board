package com.agile.demo.controller;

import com.agile.demo.dto.PostDto;
import com.agile.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class PageController {

    @Autowired
    PostService postService;

    @GetMapping("/input")
    public String showInputPage(Model model) {
        model.addAttribute("postDto", new PostDto());
        return "input"; // Thymeleaf 템플릿 이름
    }

    @GetMapping("/password1/{number}")
    public String updatePasswordPage(Model model, @PathVariable Integer number) {
        model.addAttribute("number", number);
        model.addAttribute("postDto", new PostDto());
        return "password1";
    }

    @GetMapping("/password2/{number}")
    public String deletePasswordPage(Model model, @PathVariable Integer number) {
        model.addAttribute("number", number);
        model.addAttribute("postDto", new PostDto());
        return "password2";
    }

    @PostMapping("/v1/updateposts/{number}")
    public String updateFindPasswordPage(Model model, @ModelAttribute("postDto") PostDto postDto,  @PathVariable Long number) {
        String yn = postService.findPassword(postDto, number);
        model.addAttribute("updatepostDto", new PostDto());

        if(yn.equals("y"))
            return "update";
        else
            return "board";
    }

    @PostMapping("/v1/deleteposts/{number}")
    public String deleteFindPasswordPage(Model model, @ModelAttribute("postDto") PostDto postDto,  @PathVariable Long number) {
        String yn = postService.findPassword(postDto, number);
        model.addAttribute("updatepostDto", new PostDto());

        if(yn.equals("y"))
            return "update";
        else
            return "board";
    }

}
