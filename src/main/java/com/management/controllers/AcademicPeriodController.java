package com.management.controllers;

import com.management.domain.entities.AcademicPeriod;
import com.management.services.AcademicPeriodImplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("academicPeriod")
@CrossOrigin("*")
public class AcademicPeriodController {

    @Autowired
    private AcademicPeriodImplService academicPeriodService;

    @RequestMapping(method = RequestMethod.GET,produces = "application/json")
    @ResponseBody
    public List<AcademicPeriod> findAll(){
        return this.academicPeriodService.findAll();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public AcademicPeriod findById(@PathVariable long id){
        return this.academicPeriodService.findById(id);
    }
    
    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public AcademicPeriod create(@RequestBody AcademicPeriod academicPeriod){
        return this.academicPeriodService.create(academicPeriod);
    }

    @RequestMapping(value = "{id}",method = RequestMethod.PATCH,produces = "application/json")
    @ResponseBody
    public AcademicPeriod update(@PathVariable long id, @RequestBody AcademicPeriod academicPeriod){
        return  this.academicPeriodService.update(id,academicPeriod);
    }

}
