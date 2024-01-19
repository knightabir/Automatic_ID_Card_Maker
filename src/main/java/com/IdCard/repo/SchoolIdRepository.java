package com.IdCard.repo;

import com.IdCard.entity.SchoolId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SchoolIdRepository extends JpaRepository<SchoolId, Long> {
    List<SchoolId> findBySchoolUserId(Long schoolUserId);
}
