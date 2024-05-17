package com.abir.joblisting.service;

import com.abir.joblisting.model.School;
import org.bson.types.ObjectId;

import java.util.List;

public interface SchoolService {
    List<School> getALlSchools();
    public School getSchoolById(ObjectId id);
    public School saveSchool(School school);
    public School updateSchool(ObjectId id, School school);
    public void deleteSchoolById(ObjectId id);
}
