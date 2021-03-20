package ru.vaseba.skills.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.vaseba.skills.entity.Language;
import ru.vaseba.skills.entity.Programmer;


import java.util.Arrays;

@Controller
public class WebController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("user", new Programmer(1L, "Boris",
                Arrays.asList(new Language(1L, "Test", "Test description", null),
                        new Language(2L, "Test1", "Test description1", null)),
                null));
        return "index";
    }

    @GetMapping("/create_developer")
    public String developer() {
        return "developer";
    }

    @GetMapping("/create_language")
    public String language() {
        return "language";
    }

    @GetMapping("/vacancies/version/one")
    public String vacancies() {
        return "vacancies";
    }

    @GetMapping("/vacancies/version/two")
    public String vacanciesTwo() {
        return "vacancies_version_two";
    }

}
