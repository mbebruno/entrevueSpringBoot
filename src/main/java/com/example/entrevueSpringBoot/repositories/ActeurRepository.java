package com.example.entrevueSpringBoot.repositories;


import com.example.entrevueSpringBoot.model.entities.Acteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActeurRepository extends JpaRepository<Acteur,Long> {
}
