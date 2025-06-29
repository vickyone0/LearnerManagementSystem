package com.airtribe.LearnerManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airtribe.LearnerManagementSystem.entity.Cohort;


@Repository
public interface CohortRepository extends JpaRepository<Cohort, Long> {
    
    // Additional query methods can be defined here if needed
    
}
