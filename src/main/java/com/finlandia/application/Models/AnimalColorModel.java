package com.finlandia.application.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "animal_color")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AnimalColorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_animal_color")
    private UUID idAnimalColor;
    @Column(name = "animal_color", nullable = false)
    private String animalColor;

}