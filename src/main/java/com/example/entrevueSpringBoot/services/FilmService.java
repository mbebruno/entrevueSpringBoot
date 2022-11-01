package com.example.entrevueSpringBoot.services;

import com.example.entrevueSpringBoot.model.dto.FilmDto;

public interface FilmService {

    public FilmDto saveFilm(FilmDto filmDto);
    public FilmDto getFilm(long id);
}
