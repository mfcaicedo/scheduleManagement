package com.management.domain.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String lastname;
    private Enum_TypeId tipoId;
    private String identityCard;
    private Enum_TypeTeacher type;
    private Enum_TypeContract typeContract;
    private String area;
    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;

    public Teacher() {}

    public Teacher(long id, String name, String lastname, Enum_TypeId tipoId, String identityCard, Enum_TypeTeacher type, Enum_TypeContract typeContract, String area, String status, Schedule schedule) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.tipoId = tipoId;
        this.identityCard = identityCard;
        this.type = type;
        this.typeContract = typeContract;
        this.area = area;
        this.status = status;
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Enum_TypeId getTipoId() {
        return tipoId;
    }

    public void setTipoId(Enum_TypeId tipoId) {
        this.tipoId = tipoId;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public Enum_TypeTeacher getType() {
        return type;
    }

    public void setType(Enum_TypeTeacher type) {
        this.type = type;
    }

    public Enum_TypeContract getTypeContract() {
        return typeContract;
    }

    public void setTypeContract(Enum_TypeContract typeContract) {
        this.typeContract = typeContract;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}
