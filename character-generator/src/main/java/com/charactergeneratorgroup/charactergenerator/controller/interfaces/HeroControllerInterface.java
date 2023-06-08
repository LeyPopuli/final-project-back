package com.charactergeneratorgroup.charactergenerator.controller.interfaces;

import com.charactergeneratorgroup.charactergenerator.model.Hero;

import java.io.IOException;
import java.util.List;


public interface HeroControllerInterface {
    Hero createRandomHero(String user);

    List<Hero> getAllHeroes(String user);

    Hero getHeroById(String user, Long id);

    void saveHero(String user, Hero hero);

    void updateHero(String user, Hero hero);

    byte[] downloadPdf(String user, Long id) throws IOException;

    void deleteHero(String user, Long id);

}
