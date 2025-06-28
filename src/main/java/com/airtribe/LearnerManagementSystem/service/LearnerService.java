package com.airtribe.LearnerManagementSystem.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

import com.airtribe.LearnerManagementSystem.entity.Learner;
import com.airtribe.LearnerManagementSystem.repository.LearnerRepository;

@Service
public class LearnerService {
    
    @Autowired
    private LearnerRepository _learnerRepository;

    public Learner createLearner(Learner learner) {

        return _learnerRepository.save(learner);

    }

    public List<Learner> getAllLearners() {
        List<Learner> learners = _learnerRepository.findAll();
        return learners;
    }

    public Learner getLearnerById(Long learnerId) {

        Optional<Learner> learnerOptional = _learnerRepository.findById(learnerId);

        return learnerOptional.get();
    }

    public Learner getLearnerByName(String learnerName) {

        return _learnerRepository.findByName(learnerName);

    }
            
}
