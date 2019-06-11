package com.web.boardservice.webmain;

import com.web.boardservice.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class WebController {

    private PostsService postsService;

    @GetMapping("/")
    public String main(Model model) {
        System.out.println("web main controller!");
        model.addAttribute("posts", postsService.findAllDesc());

        return "main";
    }
}
