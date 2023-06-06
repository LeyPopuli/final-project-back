package com.charactergeneratorgroup.charactergenerator.repository;

import com.charactergeneratorgroup.charactergenerator.model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface HeroRepository extends JpaRepository<Hero,Long> {

    void deleteById(Long id);

    List<Hero> findAllByUser_UserName(String username);

    Optional<Hero> findByUser_UserNameAndId(String username, Long Id);
}
