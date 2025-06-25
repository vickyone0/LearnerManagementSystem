package com.airtribe.LearnerManagementSystem.controller;

import org.springframework.web.bind.annotation.PostMapping;

public class LearnerController {

    @PostMapping("/learners")
    public String createLearner() {
        return "Learner created succ";
    }
    
}
