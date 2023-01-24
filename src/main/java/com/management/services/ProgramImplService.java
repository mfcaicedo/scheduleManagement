package com.management.services;

import com.management.domain.entities.Program;
import com.management.repository.IRepositoryProgram;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProgramImplService implements IProgramService {
    @Autowired
    public IRepositoryProgram repositoryProgram;

    @Override
    public List<Program> findAll() {
        return (List<Program>) repositoryProgram.findAll();
    }

    @Override
    public Program findById(Long id) {
        Program program = repositoryProgram.findById(id).orElse(null);
        return program;
    }

    @Override
    public Program create(Program program) {
        return repositoryProgram.save(program);
    }

    @Override
    public Program update(Long id, Program program) {
        Program program1 = this.findById(id);
        program1.setName(program.getName());
        program1.setCode(program.getCode());
        program1.setAcademicPeriod(program.getAcademicPeriod());
        program1.setCompetences(program.getCompetences());
        return repositoryProgram.save(program1);
    }

    @Override
    public List<Program> findProgramsByAcademicPeriod(Long id) {
        List<Program> auxLstProgram = new ArrayList<>();
        repositoryProgram.loadPrograms(id).forEach(auxLstProgram::add);

        return auxLstProgram;
    }
}
