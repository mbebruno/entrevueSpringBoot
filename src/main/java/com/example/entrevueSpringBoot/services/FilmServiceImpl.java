package com.example.entrevueSpringBoot.services;

import com.example.entrevueSpringBoot.mapper.FilmMapper;
import com.example.entrevueSpringBoot.model.dto.FilmDto;
import com.example.entrevueSpringBoot.model.entities.Acteur;
import com.example.entrevueSpringBoot.model.entities.Film;
import com.example.entrevueSpringBoot.repositories.ActeurRepository;
import com.example.entrevueSpringBoot.repositories.FilmRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FilmServiceImpl implements FilmService{

    private FilmRepository filmRepository;
    private ActeurRepository auteurRepository;
    private FilmMapper filmMapper;

    public  FilmServiceImpl(FilmRepository filmRepository, ActeurRepository auteurRepository,
                            FilmMapper filmMapper){

        this.filmRepository=filmRepository;
        this.auteurRepository=auteurRepository;
        this.filmMapper=filmMapper;
    }
    @Override
    @Transactional
    public FilmDto saveFilm(FilmDto filmDto) {
        Film film=this.filmMapper.filmDtoToFilm(filmDto);
        for(Acteur acteur:film.getActeurs()) {
            acteur.setFilm(film);
        }
       return this.filmMapper.filmToFilmDto(this.filmRepository.save(film));

    }

    @Override
    public FilmDto getFilm(long id) {
        return this.filmMapper.filmToFilmDto(this.filmRepository.getById(id));
    }
}
