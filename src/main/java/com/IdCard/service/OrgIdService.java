package com.IdCard.service;

import com.IdCard.entity.OrgId;
import com.IdCard.entity.OrgUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrgIdService{
    public OrgId addId(OrgId orgId);
    public OrgId updateId(OrgId orgId, Long userId) throws Exception;
    public List<OrgId> getOrgId();
    public OrgId getOrgIdById(Long orgIdId);
    public void deleteOrgIdById(Long orgIdID);
    List<OrgId> getListOfId(Long orgId);
}
