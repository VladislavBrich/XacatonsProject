package com.example.demo.Controllers;

import com.example.xacton_trying_2.Models.AnswerModel;
import com.example.xacton_trying_2.Models.TestModel;
import com.example.xacton_trying_2.repositories.AnswerRepo;
import com.example.xacton_trying_2.repositories.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/teacherJava")
public class TeacherControllerRise_2 {

    @Autowired
    private TestRepo testRepo;

    @Autowired
    private AnswerRepo answerRepo;

    @GetMapping()
    public String Recipes(Model model) {
        List<TestModel> list = testRepo.findAllByIfCheck(false);
        model.addAttribute("test", list);
        return "teacherJava";
    }

    List<TestModel> testModels = new ArrayList<>();

    @GetMapping("/{id}")
    public String getDetail(@PathVariable long id, Model model) {
        Optional<TestModel> optionalTestModel = testRepo.findById(id);

        optionalTestModel.ifPresent(testModels::add);
        model.addAttribute("test", testModels);
        return "detail";
    }

    @PostMapping("/{id}")
    public RedirectView disc(@RequestParam String disc) {
        AnswerModel answerModel = new AnswerModel();
        answerModel.setDisc(disc);
        answerModel.setName(testModels.get(0).getUser());
        answerRepo.save(answerModel);
        testModels.get(0).setIfCheck(true);
        testRepo.save(testModels.get(0));
        return new RedirectView("/teacherJava");
    }
}
