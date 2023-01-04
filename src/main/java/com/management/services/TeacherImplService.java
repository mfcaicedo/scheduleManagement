package com.management.services;

import com.management.domain.entities.Teacher;
import com.management.repository.IRepositoryTeacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherImplService implements ITeacherService{
    @Autowired
    private IRepositoryTeacher repositoryTeacher;

    @Override
    public List<Teacher> findAll() {
        return (List<Teacher>) repositoryTeacher.findAll();
    }

    @Override
    public Teacher findById(Long id) {
        Teacher teacher = repositoryTeacher.findById(id).orElse(null);
        return teacher;
    }

    @Override
    public Teacher create(Teacher teacher) {
        
        return repositoryTeacher.save(teacher);
    }

    @Override
    public Teacher update(Long id, Teacher teacher) {
        Teacher teacher1 = this.findById(id);
        teacher1.setName(teacher.getName());
        teacher1.setLastname(teacher.getLastname());
        teacher1.setTipoId(teacher.getTipoId());
        teacher1.setIdentityCard(teacher.getIdentityCard());
        teacher1.setType(teacher.getType());
        teacher1.setTypeContract(teacher.getTypeContract());
        teacher1.setArea(teacher.getArea());
        teacher1.setStatus(teacher.getStatus());
        return repositoryTeacher.save(teacher1);
    }

    @Override
    public void disableById(Long id) {
        Teacher teacher = this.findById(id);
        teacher.setStatus("disabled");
    }
}
