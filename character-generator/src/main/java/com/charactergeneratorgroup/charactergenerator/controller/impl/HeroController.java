package com.charactergeneratorgroup.charactergenerator.controller.impl;

import com.charactergeneratorgroup.charactergenerator.model.Hero;
import com.charactergeneratorgroup.charactergenerator.repository.HeroRepository;
import com.charactergeneratorgroup.charactergenerator.service.impl.HeroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/hero")
public class HeroController {

    @Autowired
    HeroService heroService;

    @Autowired
    HeroRepository heroRepository;

    @GetMapping("/random/{user}")
    public Hero createRandomHero(@PathVariable String user) {
        return heroService.createRandomHero(user);
    }

    @PostMapping(path = "/save/{user}")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveHero(@PathVariable String user, @RequestBody @Valid Hero hero) {
        heroRepository.save(hero);
    }
}
