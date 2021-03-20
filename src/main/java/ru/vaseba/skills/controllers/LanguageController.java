package ru.vaseba.skills.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.vaseba.skills.entity.Language;
import ru.vaseba.skills.servise.LanguageService;


import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/languages")
public class LanguageController {

    private LanguageService languageService;

    @Autowired
    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @PostMapping
    public ResponseEntity save(@RequestBody Language language) {
        return ResponseEntity.ok(languageService.save(language));
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        Optional<Language> byId = languageService.findById(id);
        return Objects.isNull(byId)
                ? ResponseEntity.notFound().build()
                : ResponseEntity.ok(byId);

    }

    @GetMapping
    public ResponseEntity findAll() {
        return ResponseEntity.ok(languageService.findAll());
    }
}
