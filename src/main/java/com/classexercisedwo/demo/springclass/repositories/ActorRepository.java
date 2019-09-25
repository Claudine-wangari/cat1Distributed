package com.classexercisedwo.demo.springclass.repositories;

import com.classexercisedwo.demo.springclass.models.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor,Long> {
}
