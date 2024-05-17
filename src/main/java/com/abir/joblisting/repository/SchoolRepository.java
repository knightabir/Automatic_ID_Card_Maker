package com.abir.joblisting.repository;

import com.abir.joblisting.model.School;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SchoolRepository extends MongoRepository<School, ObjectId> {
    School findBySchoolName(String schoolName);
}
