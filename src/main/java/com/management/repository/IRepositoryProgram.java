package com.management.repository;

import com.management.domain.entities.Program;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryProgram extends JpaRepository<Program, Long> {
}
