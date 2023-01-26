package com.management.controllers;

import com.management.domain.entities.Schedule;
import com.management.services.IScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("schedule")
@CrossOrigin("*")
public class ScheduleController {
    @Autowired
    private IScheduleService scheduleService;

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Schedule findById(@PathVariable Long id){
        Schedule schedule = scheduleService.findById(id);
        return schedule;
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<Schedule> findAll(){
        return (List<Schedule>) scheduleService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public Schedule create(@RequestBody Schedule scheule){
        return scheduleService.create(scheule);
    }

    @RequestMapping(value = {"{id}"}, method = RequestMethod.PATCH, produces = "application/json")
    @ResponseBody
    public Schedule update(@RequestBody Schedule schedule, @PathVariable Long id) {
        return scheduleService.update(id, schedule);
    }

    /**
     * Método para eliminar una franja horaria
     * @param id indentificador de la franja horaria a eliminar
     */
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = "application/json")
    @ResponseBody
    public void delete(@PathVariable Long id) {
        scheduleService.deleteById(id);
    }
}
