package com.airtribe.LearnerManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import com.airtribe.LearnerManagementSystem.Exception.LearnerNotFoundException;
import com.airtribe.LearnerManagementSystem.entity.Cohort;
import com.airtribe.LearnerManagementSystem.entity.CohortDTO;
import com.airtribe.LearnerManagementSystem.entity.Learner;
import com.airtribe.LearnerManagementSystem.entity.LearnerDTO;
import com.airtribe.LearnerManagementSystem.service.LearnerService;

@RestController
public class LearnerController {
    
    @Autowired
    private LearnerService _learnerService;

    @PostMapping("/learners")
    public Learner createLearner(@RequestBody Learner learner) {
        return _learnerService.createLearner(learner);
    }

    

    @GetMapping("/learners")
    public List<LearnerDTO> findLearners(@RequestParam(value ="learnerName", required = false) String learnerName, 
                                @RequestParam(value = "learnerId", required = false) Long learnerId) throws LearnerNotFoundException{

                                    if (learnerName == null && learnerId == null) {

                                        List<Learner> learnerList = _learnerService.getAllLearners();

                                        List<LearnerDTO> learnerDTOs = new ArrayList<>();
                                        
                                        for (Learner learner : learnerList) {

                                            List<Cohort> cohorts = learner.getCohorts();

                                            List<CohortDTO> cohortDTOs = new ArrayList<>();
                                            for (Cohort coho : cohorts) {
                                                CohortDTO cohortDTO = new CohortDTO();
                                                cohortDTOs.add(cohortDTO);
                                            }
                                            LearnerDTO learnerDTO = new LearnerDTO();

                                        }
                                        
                                        return learnerDTOs;
                                    } else if (learnerName != null) {
                                         Learner learner = _learnerService.getLearnerByName(learnerName);
    LearnerDTO learnerDTO = new LearnerDTO();
    // Set properties from learner to learnerDTO as needed
    return List.of(learnerDTO);
                                    } else {
                                        Learner learner = _learnerService.getLearnerById(learnerId);
    LearnerDTO learnerDTO = new LearnerDTO();
    // Set properties from learner to learnerDTO as needed
    return List.of(learnerDTO);
                                    }
    }
    
}
