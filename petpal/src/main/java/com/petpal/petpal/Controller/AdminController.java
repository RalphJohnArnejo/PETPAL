package com.petpal.petpal.Controller;

import com.petpal.petpal.Entity.AdminEntity;
import com.petpal.petpal.Service.AdminService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/admins")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping
    public AdminEntity createAdmin(@RequestBody AdminEntity admin) {
        return adminService.createAdmin(admin);
    }

    @GetMapping
    public List<AdminEntity> getAllAdmins() {
        return adminService.getAllAdmins();
    }

    @GetMapping("/{id}")
    public AdminEntity getAdminById(@PathVariable int id) {
        return adminService.getAdminById(id);
    }

    @PutMapping("/{id}")
    public AdminEntity updateAdmin(@PathVariable int id, @RequestBody AdminEntity admin) {
        return adminService.updateAdmin(id, admin);
    }

    @DeleteMapping("/{id}")
    public String deleteAdmin(@PathVariable int id) {
        adminService.deleteAdmin(id);
        return "Admin deleted successfully!";
    }
}