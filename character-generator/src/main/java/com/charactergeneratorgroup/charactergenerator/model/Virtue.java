package com.charactergeneratorgroup.charactergenerator.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Virtue {
    @Id
    private String id;
    private String name;
    @Column(length = 1000)
    private String description;
}
