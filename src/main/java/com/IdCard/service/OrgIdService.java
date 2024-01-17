package com.IdCard.service;

import com.IdCard.entity.OrgId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrgIdService extends JpaRepository<OrgId,Long> {
}
