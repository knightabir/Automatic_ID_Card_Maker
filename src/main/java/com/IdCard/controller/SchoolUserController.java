package com.IdCard.controller;

import com.IdCard.entity.SchoolUser;
import com.IdCard.service.SchoolUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/school")
@CrossOrigin("*")
public class SchoolUserController {

    @Autowired(required = true)
    private SchoolUserService schoolUserService;

    @GetMapping("/test")
    public String test(){
        return "This is the testing api";
    }

    @PostMapping("/")
    public SchoolUser createUser(@RequestBody SchoolUser schoolUser) throws Exception{
        return this.schoolUserService.createSchoolUser(schoolUser);
    }

    @GetMapping("/id/{username}")
    public SchoolUser getUserByUsername(@PathVariable("userId") Long userId){
        return this.schoolUserService.getSchoolUserById(userId);
    }

    @GetMapping("/{userId}")
    public void deleteById(@PathVariable("userId") Long userId){
        this.schoolUserService.deleteSchoolUserById(userId);
    }

    @PutMapping("/{userId}")
    public SchoolUser updateUser(@PathVariable Long userId, @RequestBody SchoolUser schoolUser) throws Exception{
        return this.schoolUserService.updateSchoolUserById(userId,schoolUser);
    }

    @GetMapping("/all")
    public List<SchoolUser> getAllUser(){
        return this.schoolUserService.GetAllSchoolUser();
    }

}
