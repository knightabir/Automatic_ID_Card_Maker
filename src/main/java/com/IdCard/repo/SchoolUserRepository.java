package com.IdCard.repo;

import com.IdCard.entity.SchoolId;
import com.IdCard.entity.SchoolUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SchoolUserRepository extends JpaRepository<SchoolUser, Long> {

}
