package com.petpal.petpal.Service;

import com.petpal.petpal.Entity.AdminEntity;
import com.petpal.petpal.Repository.AdminRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public AdminEntity createAdmin(AdminEntity admin) {
        return adminRepository.save(admin);
    }

    public List<AdminEntity> getAllAdmins() {
        return adminRepository.findAll();
    }

    public AdminEntity getAdminById(int id) {
        return adminRepository.findById(id).orElse(null);
    }

    public AdminEntity updateAdmin(int id, AdminEntity updatedAdmin) {
        return adminRepository.findById(id).map(admin -> {
            admin.setAdminName(updatedAdmin.getAdminName());
            admin.setEmail(updatedAdmin.getEmail());
            admin.setPassword(updatedAdmin.getPassword());
            admin.setRole(updatedAdmin.getRole());
            admin.setCreatedAt(updatedAdmin.getCreatedAt());
            return adminRepository.save(admin);
        }).orElse(null);
    }

    public void deleteAdmin(int id) {
        adminRepository.deleteById(id);
    }
}