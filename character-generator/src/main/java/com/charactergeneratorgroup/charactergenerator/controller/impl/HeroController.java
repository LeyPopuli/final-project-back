package com.charactergeneratorgroup.charactergenerator.controller.impl;

import com.charactergeneratorgroup.charactergenerator.controller.handler.CustomException;
import com.charactergeneratorgroup.charactergenerator.model.Hero;
import com.charactergeneratorgroup.charactergenerator.repository.HeroRepository;
import com.charactergeneratorgroup.charactergenerator.service.impl.HeroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/hero")
public class HeroController {

    @Autowired
    HeroService heroService;

    @Autowired
    private HeroRepository heroRepository;

    @GetMapping("/{user}/random")
    public Hero createRandomHero(@PathVariable String user) {
        return heroService.createRandomHero(user);
    }

    @GetMapping("/{user}")
    public List<Hero> getAllHeroes(@PathVariable String user) {
        return heroRepository.findAll();
    }

    @GetMapping("/{user}/{id}")
    public Optional<Hero> getHeroById(@PathVariable String user, @PathVariable Long id) {
        if (!heroRepository.existsById(id)) {
            throw new CustomException("Hero not found");
        }
        return heroRepository.findById(id);
    }

    @PostMapping(path = "/{user}")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveHero(@PathVariable String user, @RequestBody @Valid Hero hero) {
        heroService.saveHero(hero);
    }

    @PutMapping(path = "/{user}/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateHero(@PathVariable String user, @RequestBody @Valid Hero hero) {
        heroService.saveHero(hero);
    }

    @DeleteMapping(path = "/{user}/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteHero(@PathVariable String user, @PathVariable Long id) {
        if (!heroRepository.existsById(id)) {
            throw new CustomException("Hero not found");
        }
        heroRepository.deleteById(id);
    }

}