package com.airtribe.LearnerManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.airtribe.LearnerManagementSystem.entity.Learner;
import com.airtribe.LearnerManagementSystem.service.LearnerService;

@RestController
public class LearnerController {
    
    @Autowired
    private LearnerService _learnerService;

    @PostMapping("/learners")
    public Learner createLearner(@RequestBody Learner learner) {
        return _learnerService.createLearner(learner);
    }
    
}
