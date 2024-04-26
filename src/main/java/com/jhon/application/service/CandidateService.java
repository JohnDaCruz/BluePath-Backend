package com.jhon.application.service;

import com.jhon.application.dtos.JobDTO;
import com.jhon.application.dtos.OrganizationDTO;
import com.jhon.application.entity.CandidateEntity;
import com.jhon.application.entity.JobEntity;
import com.jhon.application.entity.OrganizationEntity;
import com.jhon.application.repository.CandidateRepository;
import com.jhon.application.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;

    @Autowired
    private OrganizationRepository organizationRepository;

    public List<CandidateEntity> getAllCandidates() {
        return candidateRepository.findAll();
    }

    public CandidateEntity createCandidate(CandidateEntity candidateEntity) {
        return candidateRepository.save(candidateEntity);
    }

    public CandidateEntity jobApply(OrganizationDTO organizationDTO, String candidateId, String jobName) {
        CandidateEntity candidate = candidateRepository.findByCandidateId(candidateId);
        OrganizationEntity organization = organizationRepository.findByOrganizationName(jobName);

        //INSERINDO O ID DO CANDIDATE NO JOB DA ORGANIZATION
        List<JobEntity> jobs = organization.getJobsInOrganization();
        for (JobEntity job : jobs) {
            if (job.getJobName().equals(jobName)) {
                List<String> candidatesIdForJob = new ArrayList<>();
                candidatesIdForJob.add(candidateId);

                job.setCandidatesInJob(candidatesIdForJob);
                break;
            }
        }

        //INSERINDO O JOB DA ORGANIZATION EM CANDIDATE
        List<JobDTO> jobsForCandidate = candidate.getJobsApplied();
        for(JobDTO job : jobsForCandidate) {
            var organizationJobForCandidate = organization.getJobsInOrganization().equals(jobName);
            if(organizationJobForCandidate){
                candidate.setJobsApplied(organizationJobForCandidate);
            }
        }




        return null;
    }
}
