package com.charactergeneratorgroup.charactergenerator.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Background {
    @Id
    private String id;
    private String name;
    @Column(length = 1000)
    private String description;
    private String peculiarity;
    @ManyToMany
    private List<Advantage> advantages;
    @ManyToMany
    private List<Skill> skills;

}
