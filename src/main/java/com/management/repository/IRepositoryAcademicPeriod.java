package com.management.repository;

import com.management.domain.entities.AcademicPeriod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryAcademicPeriod extends JpaRepository<AcademicPeriod, Long> {
}
