package com.IdCard.service;

import com.IdCard.entity.SchoolId;
import com.IdCard.entity.SchoolUser;

import java.util.List;

public interface SchoolIdService{
    public SchoolId addSchoolId(SchoolId schoolId);
    public SchoolId updateSchoolId(SchoolId schoolId);
    public SchoolId getSchoolIdById(Long schoolIdId);
    public void deleteSchoolId(Long SchoolIdId);
    public List<SchoolId> findBySchool(SchoolUser schoolUser);
}
