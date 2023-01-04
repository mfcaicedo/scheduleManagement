package com.management.services;


import com.management.domain.entities.Teacher;

import java.util.List;

public interface ITeacherService {
    public List<Teacher> findAll();

    public Teacher findById(Long id);

    public Teacher create(Teacher teacher);

    public Teacher update(Long id, Teacher teacher);

    public void disableById(Long id);
}
