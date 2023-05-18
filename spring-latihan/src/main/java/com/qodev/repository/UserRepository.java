package com.qodev.repository;

import com.qodev.domain.MasterUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<MasterUser, Integer> {
}
