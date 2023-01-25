package com.management.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "ambient")
public class Ambient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String location;
    private Enum_TypeEnvironment typeEnvironment;
    private int ability;
    private String state;
    @JsonIgnore
    @OneToMany(mappedBy = "ambient")
    private List<Schedule> schedules;

    public Ambient(){}

    public Ambient(long id, String name, String location, Enum_TypeEnvironment typeEnvironment, int ability, String state, List<Schedule> schedules) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.typeEnvironment = typeEnvironment;
        this.ability = ability;
        this.state = state;
        this.schedules = schedules;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Enum_TypeEnvironment getTypeEnvironment() {
        return typeEnvironment;
    }

    public void setTypeEnvironment(Enum_TypeEnvironment typeEnvironment) {
        this.typeEnvironment = typeEnvironment;
    }

    public int getAbility() {
        return ability;
    }

    public void setAbility(int ability) {
        this.ability = ability;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }
}
