package com.abir.joblisting.controller;

import com.abir.joblisting.model.School;
import com.abir.joblisting.model.Student;
import com.abir.joblisting.model.User;
import com.abir.joblisting.repository.StudentRepository;
import com.abir.joblisting.service.SchoolService;
import com.abir.joblisting.service.StudentService;
import com.abir.joblisting.service.UserService;
import org.springframework.security.core.Authentication;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/school")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private UserService userService;

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping()
    public Student saveStudent(@RequestBody Student student){
        student.setUser(currentUser());
        return studentService.saveStudent(student);
    }

    @GetMapping()
    public List<Student> getStudents(){
        User existingUser = currentUser();
        System.out.println(existingUser.getUsername());
        return studentRepository.findByUserId(existingUser.getId());
    }


    @GetMapping("/{id}")
    public List<Student> getAllStudents(@PathVariable ObjectId id){
        School existingSchool = schoolService.getSchoolById(id);
        return studentRepository.findBySchool(existingSchool);
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable ObjectId id){
        return studentService.getStudentById(id);
    }

    @PutMapping("/{id}")
    public Student updateStudentById(@PathVariable ObjectId id, @RequestBody Student student){
        student.setUser(currentUser());
        return studentService.updateStudent(id,student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudentById(ObjectId id){
        String response = null;

        try {
            studentService.deleteById(id);
            response = "Student Deleted Successfully";
        }catch (Exception e){
            response= e.getMessage();
        }
        return response;
    }

    //Get all the registered schools
    @GetMapping("/school")
    public List<School> getAllSchools(){
        return schoolService.getALlSchools();
    }

    //Get the current user details
    @GetMapping("/current")
    public User currentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication != null && authentication.getPrincipal() instanceof User) {
           return (User) authentication.getPrincipal();
        }
        return null;
    }

}
