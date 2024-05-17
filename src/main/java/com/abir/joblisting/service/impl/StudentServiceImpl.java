package com.abir.joblisting.service.impl;

import com.abir.joblisting.model.Student;
import com.abir.joblisting.repository.StudentRepository;
import com.abir.joblisting.service.StudentService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(ObjectId id) {
        return studentRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Student not found"));
    }

    @Override
    public Student saveStudent(Student student) {

        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(ObjectId id, Student student) {
//        getStudentById(id);
        student.setId(id);
        return studentRepository.save(student);
    }

    @Override
    public void deleteById(ObjectId id) {
        studentRepository.deleteById(id);
    }
}
