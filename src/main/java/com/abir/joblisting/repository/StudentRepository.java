package com.abir.joblisting.repository;

import com.abir.joblisting.model.School;
import com.abir.joblisting.model.Student;
import com.abir.joblisting.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StudentRepository extends MongoRepository<Student, ObjectId> {
    List<Student> findByUserId(ObjectId id);
    List<Student> findBySchool(School school);
}
