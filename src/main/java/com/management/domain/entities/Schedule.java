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

    @OneToMany(mappedBy = "schedule")
    private List<Ambient> ambientes;
    @OneToMany(mappedBy = "schedule")
    private List<Competence> competences;
    @OneToMany(mappedBy = "schedule")
    private List<Teacher> teachers;

    public Schedule(){}

    public Schedule(long id, String day, Date init_class, Date end_class, String duration, List<Ambient> ambient, List<Competence> competences, List<Teacher> teachers) {
        this.id = id;
        this.day = day;
        this.init_class = init_class;
        this.end_class = end_class;
        this.duration = duration;
        this.ambientes = ambient;
        this.competences = competences;
        this.teachers = teachers;
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

    public List<Ambient> getAmbient() {
        return ambientes;
    }

    public void setAmbient(List<Ambient> ambient) {
        this.ambientes = ambient;
    }

    public List<Competence> getCompetences() {
        return competences;
    }

    public void setCompetences(List<Competence> competences) {
        this.competences = competences;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}
