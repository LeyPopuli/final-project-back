package com.charactergeneratorgroup.charactergenerator.controller.impl;

import com.charactergeneratorgroup.charactergenerator.controller.interfaces.HeroControllerInterface;
import com.charactergeneratorgroup.charactergenerator.model.Hero;
import com.charactergeneratorgroup.charactergenerator.repository.HeroRepository;
import com.charactergeneratorgroup.charactergenerator.service.impl.HeroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/hero")
public class HeroController implements HeroControllerInterface {

    @Autowired
    HeroService heroService;

    @Autowired
    private HeroRepository heroRepository;

    @GetMapping("/{user}/random")
    @ResponseStatus(HttpStatus.CREATED)
    public Hero createRandomHero(@PathVariable String user) {
        return heroService.createRandomHero(user);
    }

    @GetMapping("/{user}")
    public List<Hero> getAllHeroes(@PathVariable String user) {
        Optional<List<Hero>> optionalHeroes = Optional.ofNullable(heroRepository.findAllByUser_UserName(user));
        return optionalHeroes.orElse(new ArrayList<>());
    }

    @GetMapping("/{user}/{id}")
    public Hero getHeroById(@PathVariable String user, @PathVariable Long id) {
        return heroService.getHeroByUserAndId(user,id);
    }

    @PostMapping(path = "/{user}")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveHero(@PathVariable String user, @RequestBody @Valid Hero hero) {
        heroService.saveHero(user, hero);
    }

//   Version 2.0, not used now
    @PutMapping(path = "/{user}/{id}")
    public void updateHero(@PathVariable String user, @RequestBody @Valid Hero hero) {
        heroService.saveHero(user, hero);
    }

    @GetMapping(path="/{user}/{id}/pdf", produces = MediaType.APPLICATION_PDF_VALUE)
    public @ResponseBody byte[] downloadPdf(@PathVariable String user, @PathVariable Long id) throws IOException {
        return heroService.downloadPdf(user, id);
    }

    @DeleteMapping("/{user}/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteHero(@PathVariable String user, @PathVariable Long id) {
        heroService.deleteById(user, id);
    }

}