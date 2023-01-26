package com.management.services;

import com.management.domain.entities.Schedule;
import com.management.repository.IRepositorySchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ScheduleImplService implements IScheduleService {
    @Autowired
    private IRepositorySchedule repositorySchedule;
    @Override
    public List<Schedule> findAll() {
        return (List<Schedule>) repositorySchedule.findAll();
    }

    @Override
    public Schedule findById(Long id) {
        Schedule schedule = repositorySchedule.findById(id).orElse(null);
        return schedule;
    }

    @Override
    public Schedule create(Schedule schedule) {
        return repositorySchedule.save(schedule);
    }

    @Override
    public Schedule update(Long id, Schedule schedule) {
        Schedule schedule1 = this.findById(id);
        schedule1.setDay(schedule.getDay());
        schedule1.setDuration(schedule.getDuration());
        schedule1.setAmbient(schedule.getAmbient());
        schedule1.setCompetence(schedule.getCompetence());
        schedule1.setTeacher(schedule.getTeacher());
        schedule1.setInit_class(schedule.getInit_class());
        schedule1.setEnd_class(schedule.getEnd_class());
        schedule1.setProgram(schedule.getProgram());

        return repositorySchedule.save(schedule1);
    }
    @Override
    public void deleteById(Long id) {
        repositorySchedule.deleteById(id);
    }
}
