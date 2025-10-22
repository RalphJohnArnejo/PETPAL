package com.petpal.petpal.Controller;

import java.util.*;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petpal.petpal.Entity.PetEntity;
import com.petpal.petpal.Service.PetService;

@RestController
@RequestMapping("/pets")
public class PetController {
    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    // Create
    @PostMapping
    public PetEntity addPet(@RequestBody PetEntity pet) {
        return petService.addPet(pet);
    }

    // Read all
    @GetMapping
    public List<PetEntity> getAllPets() {
        return petService.getAllPets();
    }

    // Read by ID
    @GetMapping("/{id}")
    public PetEntity getPetById(@PathVariable Integer id) {
        return petService.getPetById(id);
    }

    // Update
    @PutMapping("/{id}")
    public PetEntity updatePet(@PathVariable Integer id, @RequestBody PetEntity pet) {
        return petService.updatePet(id, pet);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void deletePet(@PathVariable Integer id) {
        petService.deletePet(id);
    }
}
