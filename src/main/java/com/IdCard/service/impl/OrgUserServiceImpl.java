package com.IdCard.service.impl;

import com.IdCard.entity.OrgUser;
import com.IdCard.repo.OrgUserRepository;
import com.IdCard.service.OrgUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrgUserServiceImpl implements OrgUserService {

    @Autowired
    private OrgUserRepository orgUserRepository;
    @Override
    public OrgUser addUser(OrgUser orgUser) {
        return this.orgUserRepository.save(orgUser);
    }

    @Override
    public OrgUser updateUser(OrgUser orgUser) {
        return this.orgUserRepository.save(orgUser);
    }

    @Override
    public OrgUser getUser(Long orgUserId) {
        return this.orgUserRepository.findById(orgUserId).get();
    }

    @Override
    public void deleteUser(Long orgUserId) {
        this.orgUserRepository.deleteById(orgUserId);
    }

    @Override
    public List<OrgUser> getAllUser() {
        return this.orgUserRepository.findAll();
    }
}
