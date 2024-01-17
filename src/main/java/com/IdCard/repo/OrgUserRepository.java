package com.IdCard.repo;

import com.IdCard.entity.OrgUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrgUserRepository extends JpaRepository<OrgUser, Long> {
}
