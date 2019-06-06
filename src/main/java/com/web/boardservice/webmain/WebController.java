package com.web.boardservice.webmain;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class WebController {

    @GetMapping("/")
    public String main() {
        System.out.println("web main controller!");
        return "main";
    }
}