package com.IdCard.service;

import com.IdCard.entity.OrgId;
import com.IdCard.entity.OrgUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrgUserService{
    public OrgUser addUser(OrgUser orgUser);
    public OrgUser updateUser(Long userId ,OrgUser orgUser) throws Exception;
    public OrgUser getUser(Long orgUserId);
    public void deleteUser(Long orgUserId);
    public List<OrgUser> getAllUser();
}
