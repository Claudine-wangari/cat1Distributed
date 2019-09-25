package com.classexercisedwo.demo.springclass.models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="movies")

public class Movie<categories> {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name="id")
    @NotNull(groups = Update.class)
    private Long id;

    @Column(name="name")
    @NotNull(groups = Create.class)
    private String name;

    public String getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(String yearReleased) {
        this.yearReleased = yearReleased;
    }

    @Column(name ="year_released")
    @NotNull(groups = Update.class)
    private String  yearReleased;

    private Movie() {
    }

    public Movie(
            @NotNull(groups = Create.class) String name,
            @NotNull(groups = Update.class) String yearReleased) {
        this.name = name;
        this.yearReleased = yearReleased;

    }

    public Movie(List<Actor> actors){
        this.actors = actors;
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

    public String getYear() {
        return yearReleased;
    }

    public void setYear(String year) {
        this.yearReleased = yearReleased;
    }

    public  interface Create{}

    public interface Update{}

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    @OneToMany(mappedBy = "movie")
    private List<Actor> actors;

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    @ManyToMany(mappedBy = "movies")
    Set<Category> categories = new HashSet<>();

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearReleased='" + yearReleased + '\'' +
                ", actors=" + actors +
                ", categories=" + categories +
                '}';
    }}
