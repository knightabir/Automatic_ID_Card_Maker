package com.IdCard.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
@Entity
@Table(name = "school_id")
public class SchoolId {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String firstName;
    private String lastName;
    private String fatherName;
    private String motherName;
    private String school;
    private String dob;
    private String std;
    private String section;
    private String roll;
    private String currentYear;

    @ManyToOne(cascade = CascadeType.ALL, optional = true)
    @JoinColumn(name = "school_user_id")
    @JsonIgnoreProperties("schoolId")
    private SchoolUser schoolUser;


    public SchoolId() {

    }

    public SchoolId(Long id, String firstName, String lastName, String fatherName, String motherName, String school, String dob, String std, String section, String roll, String currentYear, SchoolUser schoolUser) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.school = school;
        this.dob = dob;
        this.std = std;
        this.section = section;
        this.roll = roll;
        this.currentYear = currentYear;
        this.schoolUser = schoolUser;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(String currentYear) {
        this.currentYear = currentYear;
    }

    public SchoolUser getSchoolUser() {
        return schoolUser;
    }

    public void setSchoolUser(SchoolUser schoolUser) {
        this.schoolUser = schoolUser;
    }

    @Override
    public String toString() {
        return "SchoolId{" +
                "Id=" + Id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", school='" + school + '\'' +
                ", dob='" + dob + '\'' +
                ", std='" + std + '\'' +
                ", section='" + section + '\'' +
                ", roll='" + roll + '\'' +
                ", currentYear='" + currentYear + '\'' +
                ", schoolUser=" + schoolUser +
                '}';
    }
}
