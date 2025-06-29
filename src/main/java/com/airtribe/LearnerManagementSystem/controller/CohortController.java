package com.airtribe.LearnerManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.airtribe.LearnerManagementSystem.Exception.LearnerNotFoundException;
import com.airtribe.LearnerManagementSystem.entity.Cohort;
import com.airtribe.LearnerManagementSystem.service.LearnerService;

@RestController
public class CohortController {


    @Autowired
    private LearnerService _LearnerService;
   
    @PostMapping("/cohorts")
    public Cohort createCohort(@RequestBody Cohort cohort) {
        
        return _LearnerService.createCohort(cohort);
    }


    @PostMapping("/assignLearner")
    public Cohort assignLearnerToCohort(@RequestParam("cohortId") Long cohortId, 
                                        @RequestParam("learnerId") Long learnerId) throws LearnerNotFoundException {
     
        return _LearnerService.assignLearnerToCohort(cohortId, learnerId);
    }
    

    @GetMapping("/cohorts")
    public List<Cohort> getAllCohort() {
        return _LearnerService.getAllCohorts();
    }


}
