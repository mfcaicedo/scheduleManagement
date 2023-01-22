package com.management.services;

import com.management.domain.entities.Ambient;

import java.util.List;

public interface IAmbientService {
    public List<Ambient> findAll();

    public Ambient findById(Long id);

    public Ambient create(Ambient ambient);

    public Ambient update(Long id, Ambient ambient);

    public Ambient disableById(Long id);
}
