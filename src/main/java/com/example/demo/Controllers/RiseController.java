package com.example.demo.Controllers;


import com.example.demo.Models.TestModel;
import com.example.demo.repositories.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/rise")
public class RiseController {

    @Autowired
    TestRepo testRepo;

    @GetMapping
    public String getPage() {
        return "rise";
    }

    @PostMapping
    public RedirectView setPage(@RequestParam String name,
                                @RequestParam String first,
                                @RequestParam String second,
                                @RequestParam String third,
                                @RequestParam String fouth,
                                @RequestParam String fiveth) {
        TestModel testModel = new TestModel();
        testModel.setUser(name);
        testModel.setAnswer1(first);
        testModel.setAnswer2(second);
        testModel.setAnswer3(third);
        testModel.setAnswer4(fouth);
        testModel.setAnswer5(fiveth);
        testModel.setIfCheck(false);
        testRepo.save(testModel);
        return new RedirectView("/");
    }
}
