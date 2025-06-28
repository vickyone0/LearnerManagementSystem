package com.airtribe.LearnerManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
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

    

    @GetMapping("/learners")
    public List<Learner> findLearners(@RequestParam(value ="learnerName", required = false) String learnerName, 
                                @RequestParam(value = "learnerId", required = false) Long learnerId) {

                                    if (learnerName == null && learnerId == null) {
                                        return _learnerService.getAllLearners();
                                    } else if (learnerName != null) {
                                        return List.of(_learnerService.getLearnerByName(learnerName));
                                    } else {
                                        return List.of(_learnerService.getLearnerById(learnerId));
                                    }
    }
    
}
