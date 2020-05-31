package com.unitri.sistemamatricula.model;

import javax.persistence.*;

@Entity
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"cpf"}), @UniqueConstraint(columnNames = {"email"})}, name="admin")
public class Admin{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String cpf;
    @Column
    private String name;
    @Column
    private String email;
    @Column(name="phone_number")
    private String phoneNumber;
    @Column
    private String password;

    public Admin() {

    }

    public Admin(Long id, String cpf, String name, String email, String phoneNumber, String password) {
        this.id = id;
        this.cpf = cpf;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
