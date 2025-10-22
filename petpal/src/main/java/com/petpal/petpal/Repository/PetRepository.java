package com.petpal.petpal.Repository;

import com.petpal.petpal.Entity.PetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<PetEntity, Integer> {
    
}