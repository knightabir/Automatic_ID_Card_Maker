package com.IdCard.service.impl;

import com.IdCard.entity.OrgId;
import com.IdCard.repo.OrgUserRepository;
import com.IdCard.service.OrgIdService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrgIdServiceImpl implements OrgIdService {

    @Autowired
    private OrgUserRepository orgUserRepository;

    @Override
    public OrgId addId(OrgId orgId) {
        return null;
    }

    @Override
    public OrgId updateId(OrgId orgId) {
        return null;
    }

    @Override
    public List<OrgId> getOrgId() {
        return null;
    }

    @Override
    public OrgId getOrgIdById(Long orgIdId) {
        return null;
    }

    @Override
    public void deleteOrgIdById(Long orgIdID) {

    }
}
