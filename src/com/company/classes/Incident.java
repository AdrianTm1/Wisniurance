package com.company.classes;

import java.util.Date;

public class Incident {
    private Integer id;
    private Date incidentDate;
    private Damage damage;
    private String incidentPlace;
    private String incidentCourse;

    public Incident() {
    }

    public Incident(Integer id, Date incidentDate, Damage damage, String incidentPlace, String incidentCourse) {
        this.id = id;
        this.incidentDate = incidentDate;
        this.damage = damage;
        this.incidentPlace = incidentPlace;
        this.incidentCourse = incidentCourse;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getIncidentDate() {
        return incidentDate;
    }

    public void setIncidentDate(Date incidentDate) {
        this.incidentDate = incidentDate;
    }

    public Damage getDamage() {
        return damage;
    }

    public void setDamage(Damage damage) {
        this.damage = damage;
    }

    public String getIncidentPlace() {
        return incidentPlace;
    }

    public void setIncidentPlace(String incidentPlace) {
        this.incidentPlace = incidentPlace;
    }

    public String getIncidentCourse() {
        return incidentCourse;
    }

    public void setIncidentCourse(String incidentCourse) {
        this.incidentCourse = incidentCourse;
    }
}
