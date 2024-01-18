package com.IdCard.controller;

import com.IdCard.entity.SchoolId;
import com.IdCard.service.SchoolIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/schoolid")
public class SchoolIdController {

    @Autowired
    private SchoolIdService schoolIdService;

    @PostMapping("/")
    public SchoolId createSchoolId(@RequestBody SchoolId schoolId) throws Exception{
        return this.schoolIdService.addSchoolId(schoolId);
    }

    @GetMapping("/{userId}")
    public SchoolId getSchoolIdById(@PathVariable("userId") Long userId){
        return this.schoolIdService.getSchoolIdById(userId);
    }

    @PutMapping("/{userid}")
    public SchoolId updateSchoolId(@PathVariable("userid") Long userId,@RequestBody SchoolId schoolId) throws Exception {
        return this.schoolIdService.updateSchoolId(userId,schoolId);
    }

    @GetMapping("/all")
    public List<SchoolId> getAllSchoolId(){
        return this.schoolIdService.GetAllSchoolId();
    }

    @DeleteMapping("/{userid}")
    public void deleteUserId(@PathVariable Long userId){
        this.schoolIdService.deleteSchoolId(userId);
    }

}
