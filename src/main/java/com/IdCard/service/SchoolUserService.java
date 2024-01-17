package com.IdCard.service;

import com.IdCard.entity.SchoolUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolUserService extends JpaRepository<SchoolUser,Long> {

}
