package com.management.controllers;

import com.management.domain.entities.Competence;
import com.management.domain.entities.Program;
import com.management.services.ICompetenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("competence")
@CrossOrigin("*")
public class CompetenceController {

    @Autowired //INYECCION DE DEPENDENCIAS
    private ICompetenceService competenceService;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<Competence> findAll(){
        return(List<Competence>) competenceService.findAll();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = "applications/json")
    @ResponseBody
    public Competence findById(@PathVariable Long id){
        Competence competence = competenceService.findById(id);
        return competence;
    }
    
    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public Competence create(@RequestBody Competence competence){
        System.out.println("que llega: " + competence);
        return this.competenceService.create(competence);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PATCH, produces = "application/json")
    @ResponseBody
    public Competence update(@PathVariable long id, @RequestBody Competence competence){
        return this.competenceService.update(id,competence);
    }

    @RequestMapping(value = "disable/{id}", method = RequestMethod.PATCH, produces = "application/json")
    @ResponseBody
    public Competence disable(@PathVariable long id){
        return this.competenceService.disableById(id);
    }

    @RequestMapping(value = "/competenceProgram/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<Competence> loadCompetences(@PathVariable("id") Long id){
        return (List<Competence>)competenceService.findCompetencesByProgramId(id);
    }

}
