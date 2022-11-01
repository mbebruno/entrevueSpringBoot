package com.example.entrevueSpringBoot.web.controllers;


import com.example.entrevueSpringBoot.mapper.FilmMapper;
import com.example.entrevueSpringBoot.model.dto.FilmDto;
import com.example.entrevueSpringBoot.model.entities.Film;
import com.example.entrevueSpringBoot.services.FilmService;
import com.example.entrevueSpringBoot.web.request.FilmRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/film")
public class FilmControler {

    private FilmService filmService;
    private FilmMapper filmMapper;

    public FilmControler(FilmService filmService,FilmMapper filmMapper){

        this.filmService=filmService;
        this.filmMapper=filmMapper;
    }

    @PostMapping("")
    ResponseEntity<FilmDto> saveFilm(@RequestBody FilmRequest filmRequest){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(this.filmService.saveFilm(this.filmMapper.filmRequestToFilmDTO(filmRequest)));

    }

    @GetMapping("/{id}")
    ResponseEntity<FilmDto> saveFilm(@PathVariable Long id){
        return ResponseEntity.ok(this.filmService.getFilm(id));

    }


}
