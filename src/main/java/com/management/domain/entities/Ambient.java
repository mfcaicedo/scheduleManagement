package com.management.domain.entities;

import javax.persistence.*;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;

    public Ambient(){}

    public Ambient(long id, String name, String location, Enum_TypeEnvironment typeEnvironment, int ability, String state, Schedule schedule) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.typeEnvironment = typeEnvironment;
        this.ability = ability;
        this.state = state;
        this.schedule = schedule;
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

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
