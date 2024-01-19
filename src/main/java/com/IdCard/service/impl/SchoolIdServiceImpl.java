package com.IdCard.service.impl;

import com.IdCard.entity.SchoolId;
import com.IdCard.repo.SchoolIdRepository;
import com.IdCard.service.SchoolIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class SchoolIdServiceImpl implements SchoolIdService {

    @Autowired
    private SchoolIdRepository schoolIdRepository;


    @Override
    public SchoolId addSchoolId(SchoolId schoolId) {
        return this.schoolIdRepository.save(schoolId);
    }

    @Override
    public SchoolId updateSchoolId(Long schoolId, SchoolId updatedSchoolId) throws Exception {
        Optional<SchoolId> optionalSchoolId = schoolIdRepository.findById(schoolId);

        if (optionalSchoolId.isPresent()) {
            SchoolId existingSchoolId = optionalSchoolId.get();

            // Update the information
            existingSchoolId.setSchool(updatedSchoolId.getSchool());
            existingSchoolId.setSchoolUser(updatedSchoolId.getSchoolUser());
            existingSchoolId.setDob(updatedSchoolId.getDob());
            existingSchoolId.setMotherName(updatedSchoolId.getMotherName());
            existingSchoolId.setFirstName(updatedSchoolId.getFirstName());
            existingSchoolId.setLastName(updatedSchoolId.getLastName());
            existingSchoolId.setRoll(updatedSchoolId.getRoll());
            existingSchoolId.setFatherName(updatedSchoolId.getFatherName());

            schoolIdRepository.save(existingSchoolId);
        } else {
            throw new Exception("Id not found with this id: " + schoolId);
        }

        return optionalSchoolId.get();
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
    public List<SchoolId> GetAllSchoolId() {
        return this.schoolIdRepository.findAll();
    }

    @Override
    public List<SchoolId> getListOfId(Long id) {
        return schoolIdRepository.findBySchoolUserId(id);
    }

}
