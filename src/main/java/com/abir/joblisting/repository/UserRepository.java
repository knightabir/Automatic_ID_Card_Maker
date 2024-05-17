package com.abir.joblisting.repository;

import com.abir.joblisting.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByUsername(String username);
}
