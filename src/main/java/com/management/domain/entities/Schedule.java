package com.management.domain.entities;

import javax.persistence.*;


import java.util.Date;
import java.util.List;

@Entity
@Table(name = "schedule")
public class Schedule {

    /**
     * Atributos
     * */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String day;
    private Date init;
    private Date end;
    private String duration;

    @OneToMany(mappedBy = "schedule")
    private List<Ambient> ambients;
    @OneToMany(mappedBy = "schedule")
    private List<Competence> competences;
    @OneToMany(mappedBy = "schedule")
    private List<Teacher> teachers;

    public Schedule(){}

    public Schedule(long id, String day, Date init, Date end, String duration, List<Ambient> ambients, List<Competence> competences, List<Teacher> teachers) {
        this.id = id;
        this.day = day;
        this.init = init;
        this.end = end;
        this.duration = duration;
        this.ambients = ambients;
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

    public Date getInit() {
        return init;
    }

    public void setInit(Date init) {
        this.init = init;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public List<Ambient> getAmbients() {
        return ambients;
    }

    public void setAmbients(List<Ambient> ambients) {
        this.ambients = ambients;
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
