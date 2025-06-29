package com.airtribe.LearnerManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airtribe.LearnerManagementSystem.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    // This interface will automatically provide CRUD operations for Course entity
    // Additional custom queries can be defined here if needed

    
}
