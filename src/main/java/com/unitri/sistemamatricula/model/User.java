package unitri.sistemamatricula.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private String cpf;
    @Column
    private String name;
    @Column
    private String email;
    @Column(name="phone_number")
    private String phoneNumber;
    @Column
    private String address;
    @Column(name="previous_university")
    private String previousUniversity;
    @Column
    private String course;
    @Column
    private RegistryDocuments documents;

    public User(String name, String email, String phoneNumber, String address, String cpf, String previousUniversity, String course, RegistryDocuments documents) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.cpf = cpf;
        this.previousUniversity = previousUniversity;
        this.course = course;
        this.documents = documents;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public RegistryDocuments getDocuments() {
        return documents;
    }

    public void setDocuments(RegistryDocuments documents) {
        this.documents = documents;
    }
}
