package com.abir.joblisting.repository;

import com.abir.joblisting.model.Post;
import org.bson.codecs.ObjectIdCodec;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, ObjectId> {
}
