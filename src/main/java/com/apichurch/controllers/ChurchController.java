package com.apichurch.controllers;

import com.apichurch.dto.ChurchRequest;
import com.apichurch.dto.PersonRequest;
import com.apichurch.entities.Church;
import com.apichurch.entities.Person;
import com.apichurch.services.ChurchService;
import com.apichurch.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/igrejas")
@CrossOrigin("http://localhost:4200")
public class ChurchController {

    @Autowired
    private ChurchService service;

    @GetMapping
    public List<Church> findAll() {
        return service.getAllChurchs();
    }

    @GetMapping(value = "/{id}")
    public Church findAll(@PathVariable Long id) {
        return service.getChurchById(id);
    }

    @PostMapping
    public Church insert(@RequestBody ChurchRequest request) {
        return service.createChurch(request);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteChurch(id);
    }

    @PutMapping()
    public void delete(@RequestParam Long id, @RequestBody Church church) {
        service.updateChurch(id, church);
    }
}
