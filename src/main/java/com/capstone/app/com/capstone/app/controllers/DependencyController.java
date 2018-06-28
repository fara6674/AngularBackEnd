package com.capstone.app.com.capstone.app.controllers;

import com.capstone.app.Exceptiomns.DependencyNotFoundException;
import com.capstone.app.api.TrackedDependency;
import com.capstone.app.com.capstone.app.repositories.DependencyRepository;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.time.*;

@RestController
public class DependencyController {

    private final DependencyRepository dependencyRepository;


    @Autowired
    DependencyController(DependencyRepository dependencyRepository) {
        this.dependencyRepository = dependencyRepository;

    }

    @GetMapping("/dependencies")
    public List<TrackedDependency> getAllDependencies() {
        return dependencyRepository.findAll();
    }


    @GetMapping("/dependencies/{id}")
    public TrackedDependency retrieveUser(@PathVariable Long id) throws DependencyNotFoundException {
        TrackedDependency dependency = dependencyRepository.findOne(id);
/*
        LocalTime  i1 = dependency.getEndDate();
        */
        if (dependency.getId() <= 0) {
            throw new DependencyNotFoundException("id-" + id + " User with that id was not found ");
        }

        return 	dependency;
    }

    @PostMapping("/dependency")
    public TrackedDependency createDependency(@RequestBody TrackedDependency input) {
    	System.out.println("Here"+input.getStartDate());
       return  dependencyRepository.save(input);

    }

}

