package com.videoclub.videoclub_api.service;

import com.videoclub.videoclub_api.model.Movie;
import com.videoclub.videoclub_api.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;


    public List<Movie> obtenerTodas() {
        return movieRepository.findAll();
    }

    public Movie guardar(Movie movie) {
        return movieRepository.save(movie);
    }

    public Optional<Movie> obtenerPorId(Long id) {
        return movieRepository.findById(id);
    }

    public Movie actualizar(Long id, Movie movieActualizada) {
        return movieRepository.findById(id)
                .map(movieExistente -> {
                    movieExistente.setTitulo(movieActualizada.getTitulo());
                    movieExistente.setDirector(movieActualizada.getDirector());
                    movieExistente.setAno(movieActualizada.getAno());
                    movieExistente.setCategoria(movieActualizada.getCategoria());
                    movieExistente.setDescripcion(movieActualizada.getDescripcion());
                    movieExistente.setIdentificacion(movieActualizada.getIdentificacion());
                    return movieRepository.save(movieExistente);
                }).orElseThrow(() -> new RuntimeException("No se encontró la película con ID: " + id));
    }

    public void eliminar(Long id) {
        movieRepository.deleteById(id);
    }
}
