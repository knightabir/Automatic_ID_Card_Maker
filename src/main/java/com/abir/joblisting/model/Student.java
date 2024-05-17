package com.abir.joblisting.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
public class Student {

    @Id
    private ObjectId _id;
    private String firstname;
    private String lastName;
    private String fatherName;
    private String motherName;
    private String phone;
    private String image;
    private String className;
    private String section;
    private String roll;

    @DBRef
    @JsonIgnore
    private User user;

    @DBRef
    private School school;

    public Student() {

    }

    public Student(ObjectId id, String firstname, String lastName, String fatherName, String motherName, String phone, String image, String className, String section, String roll, User user, School school) {
        this._id = id;
        this.firstname = firstname;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.phone = phone;
        this.image = image;
        this.className = className;
        this.section = section;
        this.roll = roll;
        this.user = user;
        this.school = school;
    }

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId id) {
        this._id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + _id +
                ", firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", phone='" + phone + '\'' +
                ", image='" + image + '\'' +
                ", className='" + className + '\'' +
                ", section='" + section + '\'' +
                ", roll='" + roll + '\'' +
                ", user=" + user +
                ", school=" + school +
                '}';
    }
}
