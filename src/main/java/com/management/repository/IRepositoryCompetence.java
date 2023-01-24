package com.management.repository;

import com.management.domain.entities.Competence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IRepositoryCompetence extends JpaRepository<Competence, Long> {

    @Query(value = "select * from  competence where program_id =?1",nativeQuery = true)
    public boolean loadCompetences(long id);

}
