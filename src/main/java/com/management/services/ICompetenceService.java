package com.management.services;

import com.management.domain.entities.Competence;

import java.util.List;

public interface ICompetenceService {

    public List<Competence> findAll();

    public Competence findById(Long id);

    public Competence create(Competence competence);

    public Competence update(Long id, Competence competence);

    public Competence disableById(Long id);

    public List<Competence> findCompetencesByProgramId(Long id);

}
