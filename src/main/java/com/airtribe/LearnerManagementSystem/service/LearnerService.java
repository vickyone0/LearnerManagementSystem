package com.airtribe.LearnerManagementSystem.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

import com.airtribe.LearnerManagementSystem.Exception.LearnerNotFoundException;
import com.airtribe.LearnerManagementSystem.entity.Cohort;
import com.airtribe.LearnerManagementSystem.entity.Course;
import com.airtribe.LearnerManagementSystem.entity.Learner;
import com.airtribe.LearnerManagementSystem.repository.CohortRepository;
import com.airtribe.LearnerManagementSystem.repository.CourseRepository;
import com.airtribe.LearnerManagementSystem.repository.LearnerRepository;

@Service
public class LearnerService {
    
    @Autowired
    private LearnerRepository _learnerRepository;

    @Autowired
    private CohortRepository _cohortRepository;


    @Autowired
    private CourseRepository _courseRepository;

    public Learner createLearner(Learner learner) {

        return _learnerRepository.save(learner);

    }

    public List<Learner> getAllLearners() {
        List<Learner> learners = _learnerRepository.findAll();
        return learners;
    }

    public Learner getLearnerById(Long learnerId) throws LearnerNotFoundException {

        Optional<Learner> learnerOptional = _learnerRepository.findById(learnerId);
        if (learnerOptional.isPresent()){
            return learnerOptional.get();
        }
        throw new LearnerNotFoundException("Learner not found with id: " + learnerId);
    }

    public Learner getLearnerByName(String learnerName) {

        return _learnerRepository.findByName(learnerName);

    }

    public Cohort createCohort(Cohort cohort) {
         return _cohortRepository.save(cohort);
    }

    public Cohort assignLearnerToCohort(Long cohortId, Long learnerId) throws LearnerNotFoundException {

        Cohort cohort = _cohortRepository.findById(cohortId)
            .orElseThrow(() -> new RuntimeException("Cohort not found with id: " + cohortId));

        Learner learner = _learnerRepository.findById(learnerId)
            .orElseThrow(() -> new LearnerNotFoundException("Learner not found with id: " + learnerId));

            cohort.getLearners().add(learner);
            return _cohortRepository.save(cohort);
        
    }

    public List<Cohort> getAllCohorts() {
       return _cohortRepository.findAll();
    }

    public Course createCourse(Course course) {
        return _courseRepository.save(course);
        
    }
            
}
