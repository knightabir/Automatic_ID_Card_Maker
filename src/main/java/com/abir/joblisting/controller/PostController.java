package com.abir.joblisting.controller;

import com.abir.joblisting.model.Post;
import com.abir.joblisting.service.PostService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService postService;


    @GetMapping("/post")
    public List<Post> getAllPosts(){
        return postService.findAll();
    }

    @GetMapping("/post/{id}")
    public Post getPostById(@PathVariable ObjectId id){
        return postService.findById(id);
    }

    @PostMapping("/post")
    public Post createPost(@RequestBody Post post){
        return postService.savePost(post);
    }

    @PutMapping("/post/{id}")
    public Post updatePostById(@PathVariable ObjectId id, @RequestBody Post post){
        return postService.updatePost(id,post);
    }

    @DeleteMapping("/post/{id}")
    public String deletePostById(@PathVariable ObjectId id){
        String response = null;
        try {
            postService.deletePost(id);
            response = "Post Deleted Successfully.";
        }catch (Exception e){
            response = e.getMessage();
        }
        return response;
    }
}
