package com.jhon.application.service;

import com.jhon.application.entity.CandidateEntity;
import com.jhon.application.repository.CandidateRepository;
import com.jhon.application.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;

    @Autowired
    private CompanyRepository organizationRepository;

    public List<CandidateEntity> getAllCandidates() {
        return candidateRepository.findAll();
    }

    public CandidateEntity createCandidate(CandidateEntity candidateEntity) {
        return candidateRepository.save(candidateEntity);
    }

    /*public String jobApply(String candidateId, String jobName) {
        CandidateEntity candidate = candidateRepository.findByCandidateId(candidateId);
        CompanyEntity organization = organizationRepository.findByCompanyName(jobName);

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
        var jobsForCandidate = candidate.getJobsApplied();
        for(JobDTO jobDTO : jobsForCandidate) {
            var organizationJobForCandidate = organization.getJobsInOrganization().equals(jobName);
            if(organizationJobForCandidate){
                candidate.getJobsApplied().add(jobDTO);
            }
        }

        return "OK";
    }*/
}
