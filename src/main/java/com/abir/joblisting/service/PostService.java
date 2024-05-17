package com.abir.joblisting.service;

import com.abir.joblisting.model.Post;
import org.bson.codecs.ObjectIdCodec;
import org.bson.types.ObjectId;

import java.util.List;

public interface PostService {
    public List<Post> findAll();
    public Post findById(ObjectId id);
    public Post savePost(Post post);
    public Post updatePost(ObjectId id, Post post);
    public void deletePost(ObjectId id);
}
