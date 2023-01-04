package com.management.repository;

import com.management.domain.entities.Ambient;
import com.management.domain.entities.Program;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryAmbient extends JpaRepository<Ambient, Long> {
}
