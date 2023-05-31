package com.charactergeneratorgroup.charactergenerator.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

@Data
@Entity
@DynamicUpdate
@NoArgsConstructor
public class Virtue {
    @Id
    private String id;
    private String name;
    private String description;
}
