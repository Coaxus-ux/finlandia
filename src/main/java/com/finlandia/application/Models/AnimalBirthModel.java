package com.finlandia.application.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "birth_animal")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AnimalBirthModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "id_birth_animal")
    private UUID idBirthAnimal;
    @Column
    private String birthAnimal;
    @Column(name = "birth_status")
    private int birthStatus;
}
