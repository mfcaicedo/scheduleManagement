package com.management.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "program")
public class Program {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private int code;
    @Column
    private String name;

    //@JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "academicPeriod_id")
    private AcademicPeriod academicPeriod;
    @JsonIgnore
    @OneToMany(mappedBy = "program")
    private List<Competence> competences;

    public Program(){}

    public Program(long id, int code, String name, AcademicPeriod academicPeriod, List<Competence> competences) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.academicPeriod = academicPeriod;
        this.competences = competences;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCode() {return code; }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AcademicPeriod getAcademicPeriod() {
        return academicPeriod;
    }

    public void setAcademicPeriod(AcademicPeriod academicPeriod) {
        this.academicPeriod = academicPeriod;
    }

    public List<Competence> getCompetences() { return competences; }

    public void setCompetences(List<Competence> competences) {this.competences = competences; }

    /*
    private void addCompetence(long id, String name, String type,String state){
        Competence objCompetence = new Competence(id,name,type,state,this);
        this.competences.add(objCompetence);
    }
    */


}
