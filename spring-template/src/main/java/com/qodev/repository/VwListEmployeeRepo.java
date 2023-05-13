package com.qodev.repository;

import com.qodev.domain.VwListemployee;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VwListEmployeeRepo extends JpaRepository<VwListemployee,Long> {

    @Query("select v from VwListemployee v")
    List<VwListemployee> getAllEmployee(Pageable pageable);
}
