package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Main page");
        return "index";
    }

    @GetMapping("/index")
    public String main (Model model) {
        model.addAttribute("title", "Main page");
        return "index";
    }


}
