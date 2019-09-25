package com.classexercisedwo.demo.springclass;

import com.classexercisedwo.demo.springclass.models.Actor;
import com.classexercisedwo.demo.springclass.models.Category;
import com.classexercisedwo.demo.springclass.models.Movie;
import com.classexercisedwo.demo.springclass.repositories.ActorRepository;
import com.classexercisedwo.demo.springclass.repositories.CategoryRepository;
import com.classexercisedwo.demo.springclass.repositories.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class DummyData implements CommandLineRunner {
    private  final MovieRepository movieRepository;
    private final ActorRepository actorRepository;
    private final CategoryRepository categoryRepository;



    private String categories;

    public DummyData(MovieRepository movieRepository, ActorRepository actorRepository, CategoryRepository categoryRepository) {
        this.movieRepository = movieRepository;
        this.actorRepository = actorRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Category category =categoryRepository.save(new Category("Science Fiction"));
        Category category1 =categoryRepository.save(new Category("Thriller"));
        Set<Category> categories = new HashSet<>();
        categories.add(category);
        List<Actor> actors = new ArrayList<>();

        Movie movie = new Movie("Fast and Slow", "1990");
        movie.getCategories().add(category);
        //categories.add(category);
        movieRepository.save(movie);
        category.addMovie(movie);

        Movie movie1 = new Movie("Slow and Fast", " 1989");
        //categories.add(category1);
        movie.getCategories().add(category1);
        movieRepository.save(movie1);
        category.addMovie(movie1);

    }


}
