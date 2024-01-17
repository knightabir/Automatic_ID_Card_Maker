package com.IdCard.service;

import com.IdCard.entity.OrgId;
import com.IdCard.entity.OrgUser;

public interface OrgUserService{
    public OrgUser addUser(OrgUser orgUser);
    public OrgUser updateUser(OrgUser orgUser);
    public OrgUser getUser(Long orgUserId);
    public void deleteUser(Long orgUserId);
}
