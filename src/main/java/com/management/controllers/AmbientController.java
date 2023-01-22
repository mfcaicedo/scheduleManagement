package com.management.controllers;

import com.management.domain.entities.Ambient;
import com.management.domain.entities.Competence;
import com.management.services.IAmbientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ambient")
@CrossOrigin("*")
public class AmbientController {
    @Autowired
    private IAmbientService ambientService;

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Ambient findById(@PathVariable Long id){
        Ambient ambient = ambientService.findById(id);
        return ambient;
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<Ambient> findAll(){
        return (List<Ambient>) ambientService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public Ambient create(@RequestBody Ambient ambient){
        return ambientService.create(ambient);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PATCH, produces = "application/json")
    @ResponseBody
    public Ambient update(@RequestBody Ambient ambient, @PathVariable Long id){
        return ambientService.update(id, ambient);
    }

    @RequestMapping(value = "disable/{id}", method = RequestMethod.PATCH, produces = "application/json")
    @ResponseBody
    public Ambient disable(@PathVariable long id){
        return this.ambientService.disableById(id);
    }

}
