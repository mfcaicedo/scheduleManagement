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
        schedule1.setInit(schedule.getInit());
        schedule1.setEnd(schedule.getEnd());
        schedule1.setAmbients(schedule.getAmbients());
        schedule1.setDuration(schedule.getDuration());
        schedule1.setCompetences(schedule.getCompetences());
        schedule1.setTeachers(schedule.getTeachers());
        return null;
    }

}
