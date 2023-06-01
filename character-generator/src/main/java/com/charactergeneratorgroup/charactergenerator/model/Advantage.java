package com.charactergeneratorgroup.charactergenerator.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Advantage {
    @Id
    private String id;
    private String name;
    private int points;
    @Column(length = 1500)
    private String description;
}
