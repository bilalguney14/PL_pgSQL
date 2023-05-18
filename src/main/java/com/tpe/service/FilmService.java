package com.tpe.service;

import com.tpe.repository.FilmRepository;
import org.springframework.stereotype.Service;

@Service
public class FilmService {

    private final FilmRepository filmRepository;

    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public String getFilmCount() {

        return filmRepository.getFilmCount();
    }
}
