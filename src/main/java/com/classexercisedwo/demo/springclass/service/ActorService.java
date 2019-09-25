package com.classexercisedwo.demo.springclass.service;

import com.classexercisedwo.demo.springclass.models.Actor;

import java.util.List;

public interface ActorService {
    List<Actor> findAll();

    Actor findById(Long id);

    Actor create(Actor actor);

    void delete (Long id);

    Actor update(Actor actor);

    Actor update(Long id, Actor actor);

}
