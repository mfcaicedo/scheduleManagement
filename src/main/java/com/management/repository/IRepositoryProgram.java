package com.management.repository;

import com.management.domain.entities.Program;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IRepositoryProgram extends CrudRepository<Program, Long> {
    @Query(value = "select * from program where academic_period_id =?1",nativeQuery = true)
    public abstract List<Program> loadPrograms(long id);

}
