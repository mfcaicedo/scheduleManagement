package com.management.services;

import com.management.domain.entities.AcademicPeriod;

import java.util.List;

public interface IAcademicPeriodService {
    public List<AcademicPeriod> findAll();

    public AcademicPeriod findById(Long id);

    public AcademicPeriod create(AcademicPeriod academicPeriod);

    public AcademicPeriod update(Long id, AcademicPeriod academicPeriod);

}
