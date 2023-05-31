package com.charactergeneratorgroup.charactergenerator.repository;

import com.charactergeneratorgroup.charactergenerator.model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Hero,Long> {

}
