package com.unitri.sistemamatricula.model;


import java.util.List;

public class StudentDto {
    private Long id;
    private String cpf;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String previousUniversity;
    private String course;
    private List<Document> documents;

    public StudentDto(Long id, String cpf, String name, String email, String phoneNumber, String address, String previousUniversity, String course, List<Document> documents) {
        this.id = id;
        this.cpf = cpf;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.previousUniversity = previousUniversity;
        this.course = course;
        this.documents = documents;
    }
    public StudentDto(){}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPreviousUniversity() {
        return previousUniversity;
    }

    public void setPreviousUniversity(String previousUniversity) {
        this.previousUniversity = previousUniversity;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }
}
