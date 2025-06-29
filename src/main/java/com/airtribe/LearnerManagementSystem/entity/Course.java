package com.airtribe.LearnerManagementSystem.entity;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Course {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;


    private String courseName;
    
    @OneToMany(mappedBy = "course")
    private List<Cohort> cohortsList;

    public Course() {
        // Default constructor
    }
    public Course(Long courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;   
    }

    public Long getCourseId() {
        return courseId;
    }
    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    
}
