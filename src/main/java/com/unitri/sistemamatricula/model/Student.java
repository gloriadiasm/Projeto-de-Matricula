package com.unitri.sistemamatricula.model;

import javax.persistence.*;

@Entity
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"cpf"}), @UniqueConstraint(columnNames = {"email"})}, name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String cpf;
    @Column
    private String name;
    @Column
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column
    private String address;
    @Column(name = "previous_university")
    private String previousUniversity;
    @Column
    private String course;
    @Column
    private String documents;

    public  Student(){

    }

    public Student(Long id, String cpf, String name, String email, String phoneNumber, String address, String previousUniversity, String course, String documents) {
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

    public String getDocuments() {
        return documents;
    }

    public void setDocuments(String documents) {
        this.documents = documents;
    }
}
