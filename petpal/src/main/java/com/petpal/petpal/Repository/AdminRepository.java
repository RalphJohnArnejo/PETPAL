package com.petpal.petpal.Repository;

import com.petpal.petpal.Entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, Integer> {
    // JPA provides all CRUD methods automatically
}