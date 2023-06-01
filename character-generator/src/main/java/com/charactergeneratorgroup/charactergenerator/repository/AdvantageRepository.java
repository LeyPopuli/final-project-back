package com.charactergeneratorgroup.charactergenerator.repository;

import com.charactergeneratorgroup.charactergenerator.model.Advantage;
import com.charactergeneratorgroup.charactergenerator.model.Background;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdvantageRepository extends JpaRepository<Advantage,String> {

}
