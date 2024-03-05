package com.finlandia.application.Models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "novelty")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class NoveltyModel {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "id_novelty")
    private UUID idNovelty;
    @Column(name = "novelty_description", nullable = false)
    private String noveltyDescription;

    @ManyToMany
    @JoinTable(
        name = "animal_novelty",
        joinColumns = @JoinColumn(name = "novelty_id"),
        inverseJoinColumns = @JoinColumn(name = "animal_id")
    )
    private Set<AnimalModel> animals = new HashSet<>();
}
