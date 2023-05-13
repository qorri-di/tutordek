package com.qodev.repository;

import com.qodev.domain.MasterEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<MasterEmployee, Long> {

}
