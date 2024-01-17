package com.IdCard.service;

import com.IdCard.entity.SchoolUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolUserService{
    public SchoolUser createSchoolUser(SchoolUser schoolUser);
    public SchoolUser getSchoolUserById(Long SchoolUserId);
    public SchoolUser updateSchoolUserById(Long SchoolUserId);
    public void  deleteSchoolUserById(Long SchoolUserId);
}
