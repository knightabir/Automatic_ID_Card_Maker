package com.IdCard.service;

import com.IdCard.entity.OrgId;

import java.util.List;

public interface OrgIdService{
    public OrgId addId(OrgId orgId);
    public OrgId updateId(OrgId orgId);
    public List<OrgId> getOrgId();
    public OrgId getOrgIdById(Long orgIdId);
    public void deleteOrgIdById(Long orgIdID);
}
