package com.IdCard.service.impl;

import com.IdCard.entity.OrgId;
import com.IdCard.repo.OrgIdRepository;
import com.IdCard.repo.OrgUserRepository;
import com.IdCard.service.OrgIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrgIdServiceImpl implements OrgIdService {

    @Autowired
    private OrgIdRepository orgIdRepository;

    @Override
    public OrgId addId(OrgId orgId) {
        return this.orgIdRepository.save(orgId);
    }

    @Override
    public OrgId updateId(OrgId updatedOrgId, Long userId) throws Exception {
        Optional<OrgId> optionalOrgId = orgIdRepository.findById(userId);

        if (optionalOrgId.isPresent()){
            OrgId existingOrgId = optionalOrgId.get();

            //update the information
            existingOrgId.setBlood(updatedOrgId.getBlood());
            existingOrgId.setOrgUser(updatedOrgId.getOrgUser());
            existingOrgId.setCandidateAddress(updatedOrgId.getCandidateAddress());
            existingOrgId.setEmail(updatedOrgId.getEmail());
            existingOrgId.setPosition(updatedOrgId.getPosition());
            existingOrgId.setDateOfJoin(updatedOrgId.getDateOfJoin());
            existingOrgId.setId(updatedOrgId.getId());
            existingOrgId.setLastName(updatedOrgId.getLastName());
            existingOrgId.setFirstName(updatedOrgId.getFirstName());

            //saving the new details
            orgIdRepository.save(existingOrgId);
        }else {
            throw new Exception("Organization not found with this id "+userId);
        }
        return optionalOrgId.get();
    }


    @Override
    public List<OrgId> getOrgId() {
        return this.orgIdRepository.findAll();
    }

    @Override
    public OrgId getOrgIdById(Long orgIdId) {
        return this.orgIdRepository.findById(orgIdId).get();
    }

    @Override
    public void deleteOrgIdById(Long orgIdID) {
        this.orgIdRepository.deleteById(orgIdID);
    }

    @Override
    public List<OrgId> getListOfId(Long orgId) {
        return orgIdRepository.findByOrgUserId(orgId);
    }
}
