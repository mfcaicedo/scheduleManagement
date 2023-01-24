package com.management.services;

import com.management.domain.entities.Program;

import java.util.List;

public interface IProgramService {
    public List<Program> findAll();

    public Program findById(Long id);

    public Program create(Program program);

    public Program update(Long id, Program program);

    public List<Program> findProgramsByAcademicPeriod(Long id);
}
