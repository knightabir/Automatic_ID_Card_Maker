package com.IdCard.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "school_user")
public class SchoolUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private String password;
    private String phone;
    private String firstName;
    private String lastName;
    private String Role;
    private String school;

    @OneToMany(mappedBy = "schoolUser", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("schoolUser")
    private List<SchoolId> schoolId;

    public List<SchoolId> getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(List<SchoolId> schoolId) {
        this.schoolId = schoolId;
    }

    public SchoolUser() {

    }

    public SchoolUser(Long id, String email, String password, String phone, String firstName, String lastName, String role, String school) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.firstName = firstName;
        this.lastName = lastName;
        Role = role;
        this.school = school;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }


    @Override
    public String toString() {
        return "SchoolUser{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Role='" + Role + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}
