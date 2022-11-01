package com.example.entrevueSpringBoot.model.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class FilmDto {
    private long id;
    private String titre;
    private String description;
    private List<ActeurDto> acteurs ;
}
