package com.videoclub.videoclub_api.controller;

import com.videoclub.videoclub_api.model.Movie;
import com.videoclub.videoclub_api.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/peliculas")
@CrossOrigin(origins = "*") // Importante para que React pueda conectar sin errores
public class MovieController {

    @Autowired
    private MovieService movieService;


    @PostMapping
    public Movie crear(@RequestBody Movie movie) {
        return movieService.guardar(movie);
    }
    @GetMapping
    public List<Movie> listar() {
        return movieService.obtenerTodas();
    }

    @PutMapping("/{id}")
    public Movie actualizar(@PathVariable Long id, @RequestBody Movie movie) {
        return movieService.actualizar(id, movie);
    }

    @DeleteMapping("/{id}")
    public void borrar(@PathVariable Long id) {
        movieService.eliminar(id);
    }
}