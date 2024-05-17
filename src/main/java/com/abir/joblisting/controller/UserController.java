package com.abir.joblisting.controller;

import com.abir.joblisting.helper.Response;
import com.abir.joblisting.model.School;
import com.abir.joblisting.model.User;
import com.abir.joblisting.repository.SchoolRepository;
import com.abir.joblisting.service.SchoolService;
import com.abir.joblisting.service.UserService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class UserController {

    @Autowired
    private SchoolRepository schoolRepository;

    @Autowired
    private SchoolService schoolService;

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping()
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable ObjectId id){
        return userService.getUserById(id);
    }

    @PostMapping()
    public Response saveUser(@RequestBody User user){
        Response resp = new Response();
        List<User> result = new ArrayList<>();

        try {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            result.add(userService.saveUser(user));
            resp.result = result;
            resp.code = 200;
            resp.message = "User Added Successfully";
            resp.status = true;
        }catch (Exception e){
            resp.message ="Username already exists.   " + e.getMessage();
            resp.code = 500;
            resp.status = false;
        }
        return resp;
    }

    @PutMapping("/{id}")
    public User updateUserById(@PathVariable ObjectId id, @RequestBody User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userService.updateUserById(id,user);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable ObjectId id){
        String response = null;

        try {
            userService.deleteUserById(id);
            response = "User deleted Successfully.";
        }catch (Exception e){
            return e.getMessage();
        }
        return response;
    }

    @GetMapping("/school/{id}")
    public School getSchoolById(@PathVariable ObjectId id){
        return schoolService.getSchoolById(id);
    }

    @GetMapping("/school")
    public List<School> getAllSchool(){
        return schoolService.getALlSchools();
    }

    @PostMapping("/school")
    public School addNewSchool(@RequestBody School school){
        School existingSchool = schoolRepository.findBySchoolName(school.getSchoolName());

        if (existingSchool != null ){
            throw new IllegalArgumentException("School already Registered.");
        }else {
        return schoolService.saveSchool(school);
        }
    }

    @PutMapping("/school/{id}")
    public School updateSchoolById(@PathVariable ObjectId id, @RequestBody School school){
        return schoolService.updateSchool(id,school);
    }

    @DeleteMapping("/school/{id}")
    public String deleteSchoolById(@PathVariable ObjectId id){
        String response = null;
        try {
            schoolService.deleteSchoolById(id);
            response = "School Deleted Successfully.";
        }catch (Exception e){
            response = e.getMessage();
        }

        return response;
    }

}
