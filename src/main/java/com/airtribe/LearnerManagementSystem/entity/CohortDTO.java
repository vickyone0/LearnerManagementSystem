package com.airtribe.LearnerManagementSystem.entity;

public class CohortDTO {
    
    private String cohortName;
    private Long cohortId;

    public CohortDTO() {
        // Default constructor
    }
    public CohortDTO(String cohortName, Long cohortId) {
        this.cohortName = cohortName;
        this.cohortId = cohortId;
    }

    public String getCohortName() {
        return cohortName;
    }
    public void setCohortName(String cohortName) {
        this.cohortName = cohortName;
    }
    public Long getCohortId() {
        return cohortId;
    }
    public void setCohortId(Long cohortId) {
        this.cohortId = cohortId;
    }
    


}
