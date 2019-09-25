package com.classexercisedwo.demo.springclass.controller;

import com.classexercisedwo.demo.springclass.models.Actor;
import com.classexercisedwo.demo.springclass.service.ActorService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//http://localhost:8080/actors/{id}
@RestController
@RequestMapping(value= "actors")

public class ActorController {
    private final ActorService actorService;

    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }

    @GetMapping
    public List<Actor> findAll()
    {
        return actorService.findAll();
    }

    @GetMapping(value ="{id}")
    public  Actor findById(@PathVariable Long id)
    {
        return actorService.findById(id);
    }

    @PostMapping
    public Actor create(@Validated (Actor.Create.class) @RequestBody Actor actor) {

        return actorService.create(actor);
    }

    @DeleteMapping
    public void delete(@PathVariable Long id)
    {
        actorService.delete(id);
    }

    @PatchMapping
    public Actor update(@Validated(Actor.Update.class) @RequestBody Actor actor) {
        return actorService.update(actor);
    }

    @PatchMapping(value = "{id}")
    public Actor update(@PathVariable Long id, @RequestBody Actor actor)
    {
        return actorService.update(actor);
    }


}