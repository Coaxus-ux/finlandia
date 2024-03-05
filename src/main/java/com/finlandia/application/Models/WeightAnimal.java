package com.finlandia.application.Models;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "weight_animal")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class WeightAnimal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_weight_animal")
    private UUID idWeightAnimal;

    @Column(name = "weight_animal", nullable = false)
    private float weightAnimal;

    @Column(name = "date_weight", nullable = false)
    private String dateWeight;

    @ManyToMany
    @JoinTable(
        name = "animal_weight",
        joinColumns = @JoinColumn(name = "weight_animal_id"),
        inverseJoinColumns = @JoinColumn(name = "animal_id")
    )
    private Set<AnimalModel> animals = new HashSet<>();
}

