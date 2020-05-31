package com.unitri.sistemamatricula.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.unitri.sistemamatricula.model.Admin;
import com.unitri.sistemamatricula.repository.AdminRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Admin create(Admin admin){
        return adminRepository.save(admin);
    }

    public List<Admin> findAll(){
        return adminRepository.findAll();
    }

    public Optional<Admin> findById(Long id){
        return adminRepository.findById(id);
    }

    public void deleteById(Long id){
        adminRepository.deleteById(id);
    }

    public Admin update(Admin admin){
        return adminRepository.save(admin);
    }

    public String authenticate(String email, String password){

        Admin admin = adminRepository.findByEmail(email);
        if((admin != null)&&(admin.getPassword().equals(password))){
            return "ok";
        }else{
            return "E-mail ou senha incorretos. Tente novamente.";
        }
    }
}
