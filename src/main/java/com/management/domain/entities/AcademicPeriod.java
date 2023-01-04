package com.management.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "academicPeriod")
public class AcademicPeriod {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String name;
    @Column
    private Date date_init;
    @Column
    private Date date_end;
    @JsonIgnore
    @OneToMany(mappedBy="academicPeriod")
    private List<Program> programs;

    public AcademicPeriod(){}

    public AcademicPeriod(long id, String name, Date date_init, Date date_end, List<Program> programs) {
        this.id = id;
        this.name = name;
        this.date_init = date_init;
        this.date_end = date_end;
        this.programs = programs;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate_init() {
        return date_init;
    }

    public void setDate_init(Date date_init) {
        this.date_init = date_init;
    }

    public Date getDate_end() {
        return date_end;
    }

    public void setDate_end(Date date_end) {
        this.date_end = date_end;
    }

    public List<Program> getPrograms() {
        return programs;
    }

    public void setPrograms(List<Program> programs) {
        this.programs = programs;
    }
}

