package com.unitri.sistemamatricula.controller;

import com.unitri.sistemamatricula.model.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.unitri.sistemamatricula.model.Student;
import com.unitri.sistemamatricula.service.StudentService;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public String create(@RequestBody StudentDto student){
        studentService.create(student);
        return "Aluno criado com sucesso";
    }

    @GetMapping("/all")
    public List<StudentDto> findAll(){
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public StudentDto findById(@PathVariable Long id){
        return studentService.findById(id);
    }

    @GetMapping("/name/{name}")
    public List<StudentDto> findByName(@PathVariable String name){
        return studentService.findByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable Long id){
        studentService.deleteById(id);
        return "Removido com sucesso.";
    }

    @PutMapping("/update")
    public Student update(@RequestBody Student student){
        return studentService.update(student);
    }
}
