package com.unitri.sistemamatricula.controller;

import com.unitri.sistemamatricula.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.unitri.sistemamatricula.model.Admin;
import com.unitri.sistemamatricula.service.AdminService;

import java.util.List;
import java.util.Optional;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("admin/create")
    public Admin create(@RequestBody Admin admin){
        return adminService.create(admin);
    }

    @GetMapping("admin/all")
    public List<Admin> findAll(){
        return adminService.findAll();
    }

    @GetMapping("admin/{id}")
    public Optional<Admin> findById(@PathVariable Long id){
        return adminService.findById(id);
    }

    @DeleteMapping("admin/delete/{id}")
    public String deleteById(@PathVariable Long id){
        adminService.deleteById(id);
        return "Removido com sucesso.";
    }

    @PutMapping("admin/update")
    public Admin update(@RequestBody Admin admin){
        return adminService.create(admin);
    }

    @PostMapping("/login")
    public String authenticate(@RequestBody Login login){
        return adminService.authenticate(login.getEmail(), login.getPassword());
    }
}
