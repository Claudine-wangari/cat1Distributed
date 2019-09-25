package com.classexercisedwo.demo.springclass.repositories;

import com.classexercisedwo.demo.springclass.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Long> {
}
