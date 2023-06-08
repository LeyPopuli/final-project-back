package com.charactergeneratorgroup.charactergenerator.service.interfaces;

import com.charactergeneratorgroup.charactergenerator.model.Hero;

import java.io.IOException;

public interface HeroServiceInterface {

    Hero createRandomHero(String userName);

    void saveHero(String userName, Hero hero);

    Hero getHeroByUserAndId(String userName, Long id);

    byte[] downloadPdf(String username, Long id) throws IOException;

    void deleteById(String userName, Long id);
}
