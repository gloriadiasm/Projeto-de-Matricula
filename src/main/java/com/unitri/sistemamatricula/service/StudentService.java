package com.unitri.sistemamatricula.service;

import com.unitri.sistemamatricula.model.Document;
import com.unitri.sistemamatricula.model.StudentDto;
import com.unitri.sistemamatricula.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.unitri.sistemamatricula.model.Student;
import com.unitri.sistemamatricula.repository.StudentRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private DocumentRepository documentRepository;

    @Transactional
    public void create(StudentDto studentDto){

        Student student = new Student(null, studentDto.getCpf(), studentDto.getName(), studentDto.getEmail(),
                studentDto.getPhoneNumber(), studentDto.getAddress(), studentDto.getPreviousUniversity(), studentDto.getCourse());

        student = studentRepository.save(student);
        List<Document> documents = studentDto.getDocuments();
        for (Document document : documents) {
            document.setStudentId(student.getId());
            documentRepository.save(document);
        }
        studentRepository.save(student);
    }

    @Transactional
    public List<StudentDto> findAll(){

        return toDto(studentRepository.findAll());
    }

    @Transactional
    public StudentDto findById(Long id){

        Optional<Student> student1 = studentRepository.findById(id);
        Student student = student1.get();
        List<Document> documents = documentRepository.findByStudentId(id);
        return new StudentDto(student.getId(), student.getCpf(), student.getName(), student.getEmail(),
                student.getPhoneNumber(), student.getAddress(), student.getPreviousUniversity(), student.getCourse(), documents);
    }

    @Transactional
    public List<StudentDto> findByName(String name) {
        return toDto(studentRepository.findByNameContaining(name));
    }

    @Transactional
    public void deleteById(Long id){
        studentRepository.deleteById(id);
    }

    @Transactional
    public Student update(Student student){
        return studentRepository.save(student);
    }

    @Transactional
    public List<StudentDto> toDto(List<Student> students){

        List<StudentDto> studentDtos = new ArrayList<StudentDto>();
        for (Student student: students) {
            List<Document> documents = documentRepository.findByStudentId(student.getId().longValue());
            if(documents.size()>0) {
                StudentDto dto = new StudentDto(student.getId(), student.getCpf(), student.getName(), student.getEmail(),
                        student.getPhoneNumber(), student.getAddress(), student.getPreviousUniversity(), student.getCourse(), documents);
                studentDtos.add(dto);
            }
        }
        return studentDtos;
    }
}
