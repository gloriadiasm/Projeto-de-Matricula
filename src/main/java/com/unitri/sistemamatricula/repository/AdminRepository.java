package com.unitri.sistemamatricula.repository;

import com.unitri.sistemamatricula.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.unitri.sistemamatricula.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

   Admin findByEmail(String email);
}
