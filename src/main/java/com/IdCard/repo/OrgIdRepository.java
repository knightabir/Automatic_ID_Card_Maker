package com.IdCard.repo;

import com.IdCard.entity.OrgId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrgIdRepository extends JpaRepository<OrgId, Long> {
    List<OrgId> findByOrgUserId(Long orgUserId);
}
