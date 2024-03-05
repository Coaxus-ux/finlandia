package com.finlandia.application.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Entity
@Table(name = "mother")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class MotherModel {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "id_mother")
    private UUID idMother;
    @Column(name = "animal_FEDEGAN", nullable = false)
    private String animalFEDGAN;
    @Column(name = "mother_date", nullable = false)
    private String motherDate;
    @Column(name = "mother_status", nullable = false)
    private int motherStatus;
}
