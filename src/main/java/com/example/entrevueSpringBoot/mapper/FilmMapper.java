package com.example.entrevueSpringBoot.mapper;

import com.example.entrevueSpringBoot.model.dto.FilmDto;
import com.example.entrevueSpringBoot.model.entities.Film;
import com.example.entrevueSpringBoot.web.request.FilmRequest;
import org.mapstruct.Mapper;

@Mapper
public interface FilmMapper {

    FilmDto filmRequestToFilmDTO(FilmRequest filmRequest);
    Film filmDtoToFilm(FilmDto filmDto);
    FilmDto filmToFilmDto(Film film);
}
