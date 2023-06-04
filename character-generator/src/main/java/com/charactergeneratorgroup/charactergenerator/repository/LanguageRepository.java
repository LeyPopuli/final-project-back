package com.charactergeneratorgroup.charactergenerator.repository;

import com.charactergeneratorgroup.charactergenerator.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language,String> {

}
