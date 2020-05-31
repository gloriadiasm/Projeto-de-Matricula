package com.unitri.sistemamatricula.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.unitri.sistemamatricula.model.Student;
import com.unitri.sistemamatricula.service.StudentService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public Student create(@RequestBody Student student){
        return studentService.create(student);
    }

    @GetMapping("/all")
    public List<Student> findAll(){
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Student> findById(@PathVariable Long id){
        return studentService.findById(id);
    }

    @GetMapping("/name/{name}")
    public List<Student> findByName(@PathVariable String name){
        return studentService.findByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable Long id){
        studentService.deleteById(id);
        return "Removido com sucesso.";
    }

    @PutMapping("/update")
    public Student update(@RequestBody Student student){
        return studentService.create(student);
    }
}
