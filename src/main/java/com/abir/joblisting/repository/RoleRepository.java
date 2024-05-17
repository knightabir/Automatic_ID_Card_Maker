package com.abir.joblisting.repository;

import com.abir.joblisting.model.role.Role;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, ObjectId> {
}
