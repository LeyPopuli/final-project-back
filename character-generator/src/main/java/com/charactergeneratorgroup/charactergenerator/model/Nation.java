package com.charactergeneratorgroup.charactergenerator.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Nation {
    @Id
    private String id;
    private String name;
    @ManyToOne
    private Religion religion;
}
