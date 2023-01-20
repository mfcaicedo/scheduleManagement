package com.management.domain.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "schedule")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String day;
    @Column
    private Date init_class;
    @Column
    private Date end_class;
    @Column
    private String duration;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ambient_id")
    private Ambient ambient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "competence_id")
    private Competence competence;

    public Schedule(){}

    public Schedule(long id, String day, Date init_class, Date end_class, String duration, Ambient ambient, Teacher teacher, Competence competence) {
        this.id = id;
        this.day = day;
        this.init_class = init_class;
        this.end_class = end_class;
        this.duration = duration;
        this.ambient = ambient;
        this.teacher = teacher;
        this.competence = competence;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Date getInit_class() {
        return init_class;
    }

    public void setInit_class(Date init_class) {
        this.init_class = init_class;
    }

    public Date getEnd_class() {
        return end_class;
    }

    public void setEnd_class(Date end_class) {
        this.end_class = end_class;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Ambient getAmbient() {
        return ambient;
    }

    public void setAmbient(Ambient ambient) {
        this.ambient = ambient;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Competence getCompetence() {
        return competence;
    }

    public void setCompetence(Competence competence) {
        this.competence = competence;
    }
}
