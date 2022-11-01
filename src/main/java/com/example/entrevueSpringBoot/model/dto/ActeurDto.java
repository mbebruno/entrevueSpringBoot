package com.example.entrevueSpringBoot.model.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;


@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ActeurDto {

    private long id;
    private String nom;
    private String prenom;

}
