package com.petpal.petpal.Service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.petpal.petpal.Entity.PetEntity;
import com.petpal.petpal.Repository.PetRepository;

@Service
public class PetService {
    private final PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public List<PetEntity> getAllPets() {
        return petRepository.findAll();
    }

    public PetEntity getPetById(Integer id) {
        return petRepository.findById(id).orElse(null);
    }

    public PetEntity addPet(PetEntity pet) {
        return petRepository.save(pet);
    }

    public PetEntity updatePet(Integer id, PetEntity updatedPet) {
        PetEntity existing = petRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(updatedPet.getName());
            existing.setSpecies(updatedPet.getSpecies());
            existing.setBreed(updatedPet.getBreed());
            existing.setGender(updatedPet.getGender());
            existing.setAge(updatedPet.getAge());
            existing.setUserId(updatedPet.getUserId());
            existing.setCreatedAt(updatedPet.getCreatedAt());
            return petRepository.save(existing);
        }
        return null;
    }

    public void deletePet(Integer id) {
        petRepository.deleteById(id);
    }
}
