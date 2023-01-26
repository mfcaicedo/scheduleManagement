package com.management.repository;

import com.management.domain.entities.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IRepositorySchedule extends JpaRepository<Schedule, Long> {
}
