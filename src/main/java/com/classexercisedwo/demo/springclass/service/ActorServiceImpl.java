package com.classexercisedwo.demo.springclass.service;


import com.classexercisedwo.demo.springclass.NotFoundException;
import com.classexercisedwo.demo.springclass.models.Actor;
import com.classexercisedwo.demo.springclass.repositories.ActorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorServiceImpl implements ActorService {

    private final ActorRepository actorRepository;

    public ActorServiceImpl(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @Override
    public List<Actor> findAll() {
        return actorRepository.findAll();
    }

    @Override
    public Actor findById(Long id) {
        return actorRepository.findById(id).orElseThrow(()-> new NotFoundException("No actor with id " + " found"));
    }

    @Override
    public Actor create(Actor actor) {
        return actorRepository.save(actor);
    }

    @Override
    public void delete(Long id) {
    actorRepository.deleteById(id);
    }

    @Override
    public Actor update(Actor actor) {
        Actor foundActor =findById(actor.getId());
        foundActor.setName(actor.getName());
        return actorRepository.save(foundActor);
    }

    @Override
    public Actor update(Long id, Actor actor) {
        Actor foundActor =findById(actor.getId());
        foundActor.setName(actor.getName());
        return actorRepository.save(foundActor);
    }
}
