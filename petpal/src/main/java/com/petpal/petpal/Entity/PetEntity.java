package com.petpal.petpal.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "pets")
public class PetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pet_id")
    private Integer petId;

    private Integer userId;
    private String name;
    private String species;
    private String breed;
    private String gender;
    private Integer age;
    private LocalDateTime createdAt;

    // --- Constructors ---
    public PetEntity() {}

    public PetEntity(Integer userId, String name, String species, String breed, String gender, Integer age, LocalDateTime createdAt) {
        this.userId = userId;
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.createdAt = createdAt;
    }

    // --- Getters and Setters ---
    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
