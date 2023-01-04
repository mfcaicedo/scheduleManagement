package com.management.repository;

import com.management.domain.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryTeacher extends JpaRepository<Teacher, Long> {
}
