package com.jhon.application.dtos;

import com.jhon.application.entity.JobEntity;

import java.util.List;

public record CandidateDTO(
        String _id,
        String candidateName,
        String candidateEmail,
        String candidatePassword,
        List<JobEntity> jobsApplied
){
}
