package com.classexercisedwo.demo.springclass.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "actors")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @NotNull(groups = Update.class)
    private Long id;

    @Column(name="name")
    @NotNull(groups = Create.class )
    private String name;

    @ManyToOne
    @JoinColumn(name ="movie_id_fk")
    @JsonIgnore
    private Movie movie;

    private Actor() {
    }

    public Movie getMovie() {
        return movie;
    }

    public Actor(Long id, String name, Movie movie) {
        this.id = id;
        this.name = name;
        this.movie = movie;
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

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public interface  Create{}

    public interface Update{}

}
