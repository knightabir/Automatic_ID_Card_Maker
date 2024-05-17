package com.abir.joblisting.service;

import com.abir.joblisting.model.Student;
import org.bson.types.ObjectId;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    public Student getStudentById(ObjectId id);
    public Student saveStudent(Student student);
    public Student updateStudent(ObjectId id, Student student);
    public void deleteById(ObjectId id);
}
