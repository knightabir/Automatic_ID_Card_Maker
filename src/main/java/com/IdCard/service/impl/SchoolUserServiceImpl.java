package com.IdCard.service.impl;

import com.IdCard.entity.SchoolId;
import com.IdCard.entity.SchoolUser;
import com.IdCard.repo.SchoolUserRepository;
import com.IdCard.service.SchoolUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolUserServiceImpl implements SchoolUserService {

    private final SchoolUserRepository schoolUserRepository;

    @Autowired
    public SchoolUserServiceImpl(SchoolUserRepository schoolUserRepository) {
        this.schoolUserRepository = schoolUserRepository;
    }

    @Override
    public SchoolUser createSchoolUser(SchoolUser schoolUser) {
        return this.schoolUserRepository.save(schoolUser);
    }

    @Override
    public SchoolUser getSchoolUserById(Long SchoolUserId) {
        return this.schoolUserRepository.findById(SchoolUserId).get();
    }

    @Override
    public SchoolUser updateSchoolUserById(Long userId, SchoolUser schoolUser) throws Exception {
        Optional<SchoolUser> optionalSchoolUser = schoolUserRepository.findById(userId);

        if (optionalSchoolUser.isPresent()) {
            SchoolUser existingUser = optionalSchoolUser.get();

            // Update the user information
            existingUser.setEmail(schoolUser.getEmail());
            existingUser.setSchool(schoolUser.getSchool());
            existingUser.setId(schoolUser.getId());
            existingUser.setFirstName(schoolUser.getFirstName());
            existingUser.setLastName(schoolUser.getLastName());
            existingUser.setPassword(schoolUser.getPassword());
            existingUser.setPhone(schoolUser.getPhone());
            existingUser.setRole(schoolUser.getRole());

            // Update the schoolId collection
            if (schoolUser.getSchoolId() != null) {
                existingUser.getSchoolId().clear();  // Clear the existing collection
                existingUser.getSchoolId().addAll(schoolUser.getSchoolId());  // Add the new collection
            }

            schoolUserRepository.save(existingUser);
        } else {
            throw new Exception("User not found with this id: " + userId);
        }
        return optionalSchoolUser.get();
    }


    @Override
    public void deleteSchoolUserById(Long SchoolUserId) {
        this.schoolUserRepository.deleteById(SchoolUserId);
    }

    @Override
    public List<SchoolUser> GetAllSchoolUser() {
        return this.schoolUserRepository.findAll();
    }
}
