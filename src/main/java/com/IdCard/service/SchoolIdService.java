package com.IdCard.service;

import com.IdCard.entity.SchoolId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolIdService extends JpaRepository<SchoolId,Long> {
}
