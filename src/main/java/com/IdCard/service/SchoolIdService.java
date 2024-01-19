package com.IdCard.service;

import com.IdCard.entity.SchoolId;
import com.IdCard.entity.SchoolUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SchoolIdService{
    public SchoolId addSchoolId(SchoolId schoolId);
    public SchoolId updateSchoolId(Long userId , SchoolId schoolId) throws Exception;
    public SchoolId getSchoolIdById(Long schoolIdId);
    public void deleteSchoolId(Long SchoolIdId);
    public List<SchoolId> GetAllSchoolId();
    List<SchoolId> getListOfId(Long id);
}
