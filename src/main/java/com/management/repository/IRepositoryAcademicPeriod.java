package com.management.repository;

import com.management.domain.entities.AcademicPeriod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IRepositoryAcademicPeriod extends JpaRepository<AcademicPeriod, Long> {
}
