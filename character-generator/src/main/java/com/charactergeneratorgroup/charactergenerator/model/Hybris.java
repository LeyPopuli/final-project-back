package com.charactergeneratorgroup.charactergenerator.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Hybris {
    @Id
    private String id;
    private String name;
    @Column(length = 1000)
    private String description;
}
