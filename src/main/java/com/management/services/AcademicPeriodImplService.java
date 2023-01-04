package com.management.services;

import com.management.domain.entities.AcademicPeriod;
import com.management.domain.entities.Competence;
import com.management.repository.IRepositoryAcademicPeriod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AcademicPeriodImplService implements IAcademicPeriodService{
    @Autowired
    public IRepositoryAcademicPeriod repositoryAcademicPeriod;
    @Override
    public List<AcademicPeriod> findAll() {
        return  (List<AcademicPeriod>) repositoryAcademicPeriod.findAll();
    }

    @Override
    public AcademicPeriod findById(Long id) {
        AcademicPeriod academicPeriod = repositoryAcademicPeriod.findById(id).orElse(null);
        return academicPeriod;
    }

    @Override
    public AcademicPeriod create(AcademicPeriod academicPeriod) {
        return repositoryAcademicPeriod.save(academicPeriod);
    }

    @Override
    public AcademicPeriod update(Long id, AcademicPeriod academicPeriod) {
        AcademicPeriod academicPeriod1 = this.findById(id);
        academicPeriod1.setName(academicPeriod.getName());
        academicPeriod1.setDate_init(academicPeriod.getDate_init());
        academicPeriod1.setDate_end(academicPeriod.getDate_end());
        academicPeriod1.setPrograms(academicPeriod.getPrograms());
        return repositoryAcademicPeriod.save(academicPeriod1);
    }
}
