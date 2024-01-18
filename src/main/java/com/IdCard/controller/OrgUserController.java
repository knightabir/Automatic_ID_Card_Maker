package com.IdCard.controller;

import com.IdCard.entity.OrgUser;
import com.IdCard.service.OrgUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orguser")
@CrossOrigin("*")
public class OrgUserController {

    @Autowired
    private OrgUserService orgUserService;

    @PostMapping("/")
    public OrgUser createUser (@RequestBody OrgUser orgUser){
        return this.orgUserService.addUser(orgUser);
    }

    @GetMapping("/id/{userId}")
    public OrgUser getUserByUsername(@PathVariable("userId") Long userId){
        return this.orgUserService.getUser(userId);
    }

    @GetMapping("/{userId}")
    public OrgUser getUserById(@PathVariable("userid") Long userId){
        return this.orgUserService.getUser(userId);
    }

    @PutMapping("/{userId}")
    public OrgUser updateUser(@PathVariable("userId") Long userId, @RequestBody OrgUser orgUser) throws Exception{
        return this.orgUserService.updateUser(userId,orgUser);
    }

    @GetMapping("/all")
    public List<OrgUser> getAllUser(){
        return this.orgUserService.getAllUser();
    }

    @DeleteMapping("/{userId}")
    public void deleteById(@PathVariable("userId") Long userId){
        this.orgUserService.deleteUser(userId);
    }
}
