package com.management.repository;

import com.management.domain.entities.Competence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IRepositoryCompetence extends CrudRepository<Competence, Long> {
    @Query(value = "select * from competence where program_id =?1",nativeQuery = true)
   public abstract List<Competence> loadCompetences(long id);

}
