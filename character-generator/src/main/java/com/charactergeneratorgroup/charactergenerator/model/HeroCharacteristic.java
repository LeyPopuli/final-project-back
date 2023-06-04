package com.charactergeneratorgroup.charactergenerator.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class HeroCharacteristic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Characteristic characteristic;

    @ManyToOne
    @JsonBackReference
    private Hero hero;

    private Integer level;
}
