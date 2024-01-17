package com.IdCard.service;

import com.IdCard.entity.OrgUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrgUserService extends JpaRepository<OrgUser,Long> {
}
