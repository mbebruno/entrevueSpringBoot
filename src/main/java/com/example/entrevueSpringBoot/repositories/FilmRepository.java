package com.example.entrevueSpringBoot.repositories;

import com.example.entrevueSpringBoot.model.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Long> {
}
