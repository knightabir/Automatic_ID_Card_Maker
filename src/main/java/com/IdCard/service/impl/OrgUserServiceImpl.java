package com.IdCard.service.impl;

import com.IdCard.entity.OrgUser;
import com.IdCard.repo.OrgUserRepository;
import com.IdCard.service.OrgUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrgUserServiceImpl implements OrgUserService {

    @Autowired
    private OrgUserRepository orgUserRepository;
    @Override
    public OrgUser addUser(OrgUser orgUser) {
        return this.orgUserRepository.save(orgUser);
    }

    @Override
    public OrgUser updateUser(Long userId, OrgUser updatedOrgUser) throws Exception {
        Optional<OrgUser> optionalOrgUser = orgUserRepository.findById(userId);

        if (optionalOrgUser.isPresent()){
            OrgUser existingOrgUser = optionalOrgUser.get();

            //update all the information
            existingOrgUser.setOrgId(updatedOrgUser.getOrgId());
            existingOrgUser.setEmail(updatedOrgUser.getEmail());
            existingOrgUser.setId(updatedOrgUser.getId());
            existingOrgUser.setOrganization(updatedOrgUser.getOrganization());
            existingOrgUser.setPassword(updatedOrgUser.getPassword());
            existingOrgUser.setRole(updatedOrgUser.getRole());
            existingOrgUser.setOfficeAddress(updatedOrgUser.getOfficeAddress());
            existingOrgUser.setFirstName(updatedOrgUser.getFirstName());
            existingOrgUser.setLastName(updatedOrgUser.getLastName());

            orgUserRepository.save(existingOrgUser);
        }else {
            throw new Exception("User not found with this id "+ userId);
        }
        return optionalOrgUser.get();
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
