package com.airtribe.LearnerManagementSystem.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
// import jakarta.validation.constraints.NotBlank;



@Entity
public class Learner {
    //@NotBlank(message = "Name cannot be blank")
    private String name;
    private String email;
    private String phoneNumber;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Learner(String name, String email, String phoneNumber, long id) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

    @ManyToMany(mappedBy = "learners")
    private List<Cohort> cohorts;

    public Learner() {
        // Default constructor
    }

    public List<Cohort> getCohorts() {
        return cohorts;
    }
    public void setCohorts(List<Cohort> cohorts) {
        this.cohorts = cohorts;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
}
