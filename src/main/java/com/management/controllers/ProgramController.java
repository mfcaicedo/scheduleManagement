package com.management.controllers;

import com.management.domain.entities.Program;
import com.management.services.IProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("program")
@CrossOrigin("*")
public class ProgramController {
    @Autowired
    private IProgramService programService;

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Program findById(@PathVariable Long id){
        Program program = programService.findById(id);
        return program;
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<Program> findAll(){
        return (List<Program>) programService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public Program create(@RequestBody Program program){
        return programService.create(program);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PATCH, produces = "application/json")
    @ResponseBody
    public Program update(@RequestBody Program program, @PathVariable Long id){
        return programService.update(id, program);
    }
    @RequestMapping(value = "/programAcademicPeriod/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<Program> loadPrograms(@PathVariable("id") Long id){
        return (List<Program>)programService.findProgramsByAcademicPeriod(id);
    }


}
