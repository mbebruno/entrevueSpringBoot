package com.example.entrevueSpringBoot.web.request;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class FilmRequest {


    private String titre;
    private String description;
    private List<ActeurRequest> acteurs;
}
