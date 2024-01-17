package com.IdCard.service.impl;

import com.IdCard.entity.SchoolId;
import com.IdCard.entity.SchoolUser;
import com.IdCard.repo.SchoolIdRepository;
import com.IdCard.service.SchoolIdService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class SchoolIdServiceImpl implements SchoolIdService {

    @Autowired
    private SchoolIdRepository schoolIdRepository;


    @Override
    public SchoolId addSchoolId(SchoolId schoolId) {
        return this.schoolIdRepository.save(schoolId);
    }

    @Override
    public SchoolId updateSchoolId(SchoolId schoolId) {
        return this.schoolIdRepository.save(schoolId);
    }

    @Override
    public SchoolId getSchoolIdById(Long schoolIdId) {
        return this.schoolIdRepository.findById(schoolIdId).get();
    }

    @Override
    public void deleteSchoolId(Long schoolIdId) {
        this.schoolIdRepository.deleteById(schoolIdId);
    }

    @Override
    public List<SchoolId> findBySchool(SchoolUser schoolUser) {
        return this.schoolIdRepository.findAll();
    }
}
