package com.unitri.sistemamatricula.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.unitri.sistemamatricula.model.Student;
import com.unitri.sistemamatricula.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student create(Student student){
       return studentRepository.save(student);
    }

    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    public Optional<Student> findById(Long id){
        return studentRepository.findById(id);
    }

    public List<Student> findByName(String name){
        return studentRepository.findByNameContaining(name);
    }

    public void deleteById(Long id){
        studentRepository.deleteById(id);
    }

    public Student update(Student student){
        return studentRepository.save(student);
    }
}
