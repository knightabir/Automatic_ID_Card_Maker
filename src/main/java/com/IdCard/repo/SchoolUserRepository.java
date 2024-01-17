package com.IdCard.repo;

import com.IdCard.entity.SchoolUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolUserRepository extends JpaRepository<SchoolUser, Long> {
}
