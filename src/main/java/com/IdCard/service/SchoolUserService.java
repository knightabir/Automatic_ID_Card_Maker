package com.IdCard.service;
import com.IdCard.entity.SchoolUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SchoolUserService{
    public SchoolUser createSchoolUser(SchoolUser schoolUser);
    public SchoolUser getSchoolUserById(Long SchoolUserId);
    public SchoolUser updateSchoolUserById(Long userId , SchoolUser schoolUser) throws Exception;
    public void  deleteSchoolUserById(Long SchoolUserId);
    public List<SchoolUser> GetAllSchoolUser();
}
