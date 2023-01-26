package com.management.services;

import com.management.domain.entities.Schedule;

import java.util.List;

public interface IScheduleService {

    public List<Schedule> findAll();

    public Schedule findById(Long id);

    public Schedule create(Schedule schedule);

    public Schedule update(Long id, Schedule schedule);

    public void deleteById(Long id);

}
