package com.airtribe.LearnerManagementSystem.repository;
import com.airtribe.LearnerManagementSystem.entity.Learner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LearnerRepository extends JpaRepository<Learner, Long> {
    
    Learner findByName(String name);

    // Custom query methods can be defined here if needed
    // For example, to find a learner by email:
    // Optional<Learner> findByEmail(String email);
    
}
