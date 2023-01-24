package com.management.services;

import com.management.domain.entities.Competence;
import com.management.domain.entities.Program;
import com.management.repository.IRepositoryCompetence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CompetenceImplService implements  ICompetenceService{

    @Autowired
    private IRepositoryCompetence repositoryCompetence;

    @Override
    public List<Competence> findAll() {
        return (List<Competence>) repositoryCompetence.findAll();
    }

    @Override
    public Competence findById(Long id) {
        Competence competence = repositoryCompetence.findById(id).orElse(null);
        return competence;
    }

    @Override
    public Competence create(Competence competence) {

        return repositoryCompetence.save(competence);
    }

    @Override
    public Competence update(Long id, Competence competence) {
        Competence competence1 = this.findById(id);
        competence1.setName(competence.getName());
        competence1.setProgram(competence.getProgram());
        competence1.setState(competence.getState());
        competence1.setType(competence.getType());
        return repositoryCompetence.save(competence1);
    }

    @Override
    public Competence disableById(Long id) {
        Competence competence = this.findById(id);
        competence.setState("desactivado");
        return repositoryCompetence.save(competence); 
    }

    @Override
    public List<Competence> findCompetencesByProgramId(Long id) {
        List<Competence> auxLstCompetence = new ArrayList<>();
        repositoryCompetence.loadCompetences(id).forEach(auxLstCompetence::add);
        return auxLstCompetence;
    }
}
