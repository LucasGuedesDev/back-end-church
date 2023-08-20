package com.apichurch.controllers;

import java.util.List;

import com.apichurch.dto.PersonRequest;
import com.apichurch.entities.Person;
import com.apichurch.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/membros")
@CrossOrigin("http://localhost:4200")
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping
    public List<Person> findAll() {
        return service.getAllPersons();
    }

    @GetMapping(value = "/{id}")
    public Person findAll(@PathVariable Long id) {
        return service.getPersonById(id);
    }

    @PostMapping
    public Person insert(@RequestBody PersonRequest request) {
        return service.createPerson(request);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        service.deletePerson(id);
    }


}
