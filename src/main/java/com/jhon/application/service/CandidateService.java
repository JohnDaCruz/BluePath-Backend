package com.jhon.application.service;

import com.jhon.application.dtos.JobDTO;
import com.jhon.application.entity.CandidateEntity;
import com.jhon.application.entity.JobEntity;
import com.jhon.application.repository.CandidateRepository;
import com.jhon.application.repository.JobRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;

    @Autowired
    private JobRepository jobRepository;

    public List<CandidateEntity> getAllCandidates() {
        return candidateRepository.findAll();
    }

    public CandidateEntity createCandidate(CandidateEntity candidateEntity) {
        return candidateRepository.save(candidateEntity);
    }

    public CandidateEntity jobApply(String candidateId, String jobId) {
        var candidateOptional = candidateRepository.findById(candidateId);
        var jobOptional = jobRepository.findById(jobId);

        if(jobOptional.isPresent() && candidateOptional.isPresent()){
            var job = jobOptional.get();
            var candidate = candidateOptional.get();

            List<CandidateEntity> candidatesInJobList = job.getCandidatesInJob();
            List<String> candidateJobsAppliedList = candidate.getJobsApplied();

            if (candidateJobsAppliedList == null) candidateJobsAppliedList = new ArrayList<>();
            if(candidatesInJobList == null) candidatesInJobList = new ArrayList<>();

            candidatesInJobList.add(candidate);
            candidateJobsAppliedList.add(job.get_id());

            candidate.setJobsApplied(candidateJobsAppliedList);
            job.setCandidatesInJob(candidatesInJobList);

            candidateRepository.save(candidate);
            jobRepository.save(job);
            return candidate;

        }
        return null;
    }
}
