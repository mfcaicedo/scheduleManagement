package com.management.controllers;

import com.management.domain.entities.Teacher;
import com.management.services.TeacherImplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("teacher")
@CrossOrigin("*")
public class TeacherController {
    @Autowired
    private TeacherImplService teacherService;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<Teacher> findAll(){
        return (List<Teacher>) this.teacherService.findAll();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Teacher findById(@PathVariable long id){
        return this.teacherService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST,produces = "application/json" )
    @ResponseBody
    public Teacher create(@RequestBody Teacher teacher){
        return this.teacherService.create(teacher);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.PATCH, produces = "application/json")
    @ResponseBody
    public Teacher update(@PathVariable long id, @RequestBody Teacher teacher){
        return this.teacherService.update(id,teacher);
    }


    //FALTA INHABILITAR

}
