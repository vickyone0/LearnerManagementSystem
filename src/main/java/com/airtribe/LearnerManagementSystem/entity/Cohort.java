package com.airtribe.LearnerManagementSystem.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Cohort {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cohortId;
    private String cohortName;

    @ManyToOne
    private Course course;



    @ManyToMany
    private List<Learner> learners;

    public Cohort() {
        // Default constructor
    }


    public Cohort(long cohortId, String cohortName) {
        this.cohortId = cohortId;
        this.cohortName = cohortName;
    }

    public long getCohortId() {
        return cohortId;
    }
    public void setCohortId(long cohortId) {
        this.cohortId = cohortId;
    }

    public String getCohortName() {
        return cohortName;
    }
    public void setCohortName(String cohortName) {
        this.cohortName = cohortName;
    }

    public List<Learner> getLearners() {
        return learners;
    }
    public void setLearners(List<Learner> learners) {
        this.learners = learners;
    }
}
