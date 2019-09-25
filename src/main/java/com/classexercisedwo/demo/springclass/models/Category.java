package com.classexercisedwo.demo.springclass.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="category_id")
    private Long id;

    public Category(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    @Column(name="name")
    private String name;

    @ManyToMany
    @JoinTable(
            name ="categories_movies",
            joinColumns = @JoinColumn(name ="category_id"),
            inverseJoinColumns = @JoinColumn(name="movie_id")
    )

    private Set<Movie> movies =new HashSet<>();
    private Category(){}
}
