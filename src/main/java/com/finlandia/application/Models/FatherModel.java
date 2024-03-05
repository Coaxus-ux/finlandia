package com.finlandia.application.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Entity
@Table(name = "father")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class FatherModel {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "id_father")
    private UUID idFather;

    @Column(name = "animal_FEDEGAN", nullable = false)
    private String animalFEDGAN;

    @Column(name = "father_date", nullable = false)
    private String fatherDate;

    @Column(name = "father_status", nullable = false)
    private int fatherStatus;
}
