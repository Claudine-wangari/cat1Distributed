package com.classexercisedwo.demo.springclass.controller;

import com.classexercisedwo.demo.springclass.models.Actor;
import com.classexercisedwo.demo.springclass.models.Movie;
import com.classexercisedwo.demo.springclass.service.MovieService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//http://localhost:8080/movies/{id}
@RestController
@RequestMapping(value="movies")

public class MovieController {

    private final MovieService movieService;
    private Actor actor;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<Movie> findAll()
    {
        return movieService.findAll();
    }

    @GetMapping(value = "{id}")
    public Movie findById(@PathVariable Long id)
    {
      return movieService.findById(id);
    }

    @PostMapping
    public Movie create(@Validated(Movie.Create.class) @RequestBody Movie movie)
    {
        return movieService.create(movie);
    }

    @DeleteMapping
    public void delete(@PathVariable Long id)
    {
        movieService.delete(id);
    }

    @PatchMapping
    public Movie update(@Validated(Movie.Update.class) @RequestBody Movie movie) {
        return movieService.update(movie);
    }

    @PatchMapping(value = "{id}")
    public Movie update(@PathVariable Long id, @RequestBody Movie movie)
    {
        return movieService.update(movie);
    }

    @PostMapping(value= "{id}/actors")
        public Actor create(@PathVariable Long id, @RequestBody Actor actor)
        {
            return movieService.createActor(id,actor);
        }
}

