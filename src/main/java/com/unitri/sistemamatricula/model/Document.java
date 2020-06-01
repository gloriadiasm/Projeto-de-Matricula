package com.unitri.sistemamatricula.model;

import javax.persistence.*;

@Entity
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private Long studentId;
    @Column
    private String name;
    @Column(name = "file", columnDefinition="BLOB")
    @Lob
    private byte[] file;

    public Document(){

    }

    public Document(Long id, String name, byte[] file) {
        this.id = id;
        this.name=name;
        this.file=file;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }
}
