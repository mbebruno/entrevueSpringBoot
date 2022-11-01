package com.example.entrevueSpringBoot.web.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ActeurRequest {

    private long id;
    private String nom;
    private String prenom;
}
