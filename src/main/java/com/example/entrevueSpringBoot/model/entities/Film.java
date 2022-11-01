package com.example.entrevueSpringBoot.model.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String titre;
    private String description;

    @OneToMany(
            mappedBy = "film",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Acteur> acteurs = new ArrayList<>();


}
