package com.finlandia.application.Models;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "animal")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AnimalModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_animal")
    private UUID idAnimal;

    @Column(name = "animal_name", nullable = false)
    private String name;

    @Column(name = "animal_sex", nullable = false)
    private String animalSex;

    @Column(name = "animal_birth", nullable = false)
    private String animalBirth;

    @Column(name = "animal_FEDEGAN", nullable = false)
    private String animalFEDGAN;

    @ManyToOne
    @JoinColumn(name = "id_animal_color", nullable = false)
    private AnimalColorModel animalColor;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private UserModel user;

    @ManyToOne
    @JoinColumn(name = "id_birth_animal")
    private AnimalBirthModel birthAnimal;

    @ManyToMany(mappedBy = "animals")
    private Set<WeightAnimal> weights = new HashSet<>();

    @ManyToMany(mappedBy = "animals")
    private Set<NoveltyModel> novelties = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "id_father")
    private FatherModel father;

    @ManyToOne
    @JoinColumn(name = "id_mother")
    private MotherModel mother;

    @Column(name = "animal_status", nullable = false)
    private int animalStatus;

}

