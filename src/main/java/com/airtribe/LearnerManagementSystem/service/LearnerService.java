package com.airtribe.LearnerManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airtribe.LearnerManagementSystem.entity.Learner;
import com.airtribe.LearnerManagementSystem.repository.LearnerRepository;

@Service
public class LearnerService {
    
    @Autowired
    private LearnerRepository _learnerRepository;

    public Learner createLearner(Learner learner) {

        return _learnerRepository.save(learner);

    }
    
}
