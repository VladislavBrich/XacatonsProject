package com.example.demo.Controllers;

import com.example.xacton_trying_2.Models.AnswerModel;
import com.example.xacton_trying_2.repositories.AnswerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/result")
public class ResultController {
    @Autowired
    AnswerRepo answerRepo;

    @GetMapping
    public String getPage(){
        return "result";
    }
    @PostMapping
    public String getResult(@RequestParam String name, Model model){
        List<AnswerModel> list = new ArrayList<>();
        list = answerRepo.findAllByName(name);
        model.addAttribute("list", list);
        return "ResultAll";
    }
}
