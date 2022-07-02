package com.example.demo.Controllers;

import com.example.demo.repositories.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentsController {
    @Autowired
    private TestRepo testRepo;

    @GetMapping()
    public String Recipes(Model model) {
        return "students";

    }
}
