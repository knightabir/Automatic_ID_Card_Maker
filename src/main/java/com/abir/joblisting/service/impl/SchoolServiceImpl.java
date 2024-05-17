package com.abir.joblisting.service.impl;

import com.abir.joblisting.model.School;
import com.abir.joblisting.repository.SchoolRepository;
import com.abir.joblisting.service.SchoolService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolRepository schoolRepository;


    @Override
    public List<School> getALlSchools() {
        return schoolRepository.findAll();
    }

    @Override
    public School getSchoolById(ObjectId id) {
        return schoolRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("School not found."));
    }

    @Override
    public School saveSchool(School school) {
        //Validation

        return schoolRepository.save(school);
    }

    @Override
    public School updateSchool(ObjectId id, School school) {
        School existingSchool = getSchoolById(id);
        existingSchool.set_id(id);
        existingSchool.setSchoolAddress(school.getSchoolAddress());
        existingSchool.setSchoolName(school.getSchoolName());
        existingSchool.setHoi(school.getHoi());
        return schoolRepository.save(existingSchool);
    }

    @Override
    public void deleteSchoolById(ObjectId id) {

        School existingSchool = getSchoolById(id);
        schoolRepository.delete(existingSchool);
    }
}
