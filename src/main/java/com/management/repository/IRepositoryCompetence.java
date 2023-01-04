package com.management.repository;

import com.management.domain.entities.Competence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IRepositoryCompetence extends JpaRepository<Competence, Long> {

    @Query(value = "update competence set state=?1 where id=?2",nativeQuery = true)
    public boolean disableCompetence(String state, long id);

}
