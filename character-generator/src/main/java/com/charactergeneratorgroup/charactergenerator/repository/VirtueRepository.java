package com.charactergeneratorgroup.charactergenerator.repository;

import com.charactergeneratorgroup.charactergenerator.model.Hybris;
import com.charactergeneratorgroup.charactergenerator.model.Virtue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VirtueRepository extends JpaRepository<Virtue, String> {
}