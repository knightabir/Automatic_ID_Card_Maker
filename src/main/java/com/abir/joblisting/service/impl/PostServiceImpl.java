package com.abir.joblisting.service.impl;

import com.abir.joblisting.model.Post;
import com.abir.joblisting.repository.PostRepository;
import com.abir.joblisting.service.PostService;
import org.bson.codecs.ObjectIdCodec;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public Post findById(ObjectId id) {
        return postRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Post Not found."));
    }

    @Override
    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Post updatePost(ObjectId id, Post post) {
        Post existingPost = findById(id);

        existingPost.setDesc(post.getDesc());
        existingPost.setExp(post.getExp());
        existingPost.setProfile(post.getProfile());
        existingPost.setTechs(post.getTechs());

        return postRepository.save(existingPost);
    }

    @Override
    public void deletePost(ObjectId id) {
        Post post = findById(id);
        postRepository.delete(post);
    }
}
