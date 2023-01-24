package com.management.services;

import com.management.domain.entities.Ambient;
import com.management.domain.entities.Competence;
import com.management.repository.IRepositoryAmbient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AmbientImplService implements IAmbientService{
    @Autowired
    private IRepositoryAmbient repositoryAmbient;

    @Override
    public List<Ambient> findAll() {
        return (List<Ambient>) repositoryAmbient.findAll() ;
    }

    @Override
    public Ambient findById(Long id) {
        Ambient ambient = repositoryAmbient.findById(id).orElse(null);
        return ambient;
    }

    @Override
    public Ambient create(Ambient ambient) {
        System.out.println("TIPO DE AMBIENTE: " + ambient.getTypeEnvironment());
        return repositoryAmbient.save(ambient);
    }

    @Override
    public Ambient update(Long id, Ambient ambient) {
        Ambient ambient1 = this.findById(id);
        ambient1.setName(ambient.getName());
        ambient1.setLocation(ambient.getLocation());
        ambient1.setTypeEnvironment(ambient.getTypeEnvironment());
        ambient1.setAbility(ambient.getAbility());
        ambient1.setState(ambient.getState());
        return repositoryAmbient.save(ambient1);
    }

    @Override
    public Ambient disableById(Long id) {
        Ambient ambient = this.findById(id);
        ambient.setState("disabled");
        return repositoryAmbient.save(ambient);
    }

}
