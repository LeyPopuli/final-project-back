package com.charactergeneratorgroup.charactergenerator.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import java.util.List;

@Data
@Entity
@DynamicUpdate
@NoArgsConstructor
public class Background {
    @Id
    private String id;
    private String name;
    private String description;
    private String peculiarity;
    @ManyToMany
    private List<Advantage> advantages;
    @ManyToMany
    private List<Skill> skills;

}
