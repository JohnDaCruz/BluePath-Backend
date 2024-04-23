package com.jhon.application.service;

import com.jhon.application.entity.JobEntity;
import com.jhon.application.entity.OrganizationEntity;
import com.jhon.application.repository.JobRepository;
import com.jhon.application.repository.OrganizationRepository;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;


    public List<OrganizationEntity> getAllOrganizations() {
        return organizationRepository.findAll();
    }

    public OrganizationEntity createOrganization(OrganizationEntity organization) {
        return organizationRepository.save(organization);
    }

    public OrganizationEntity addJobToOrganization(String organizationName, JobEntity job) {
        OrganizationEntity organization = organizationRepository.findByOrganizationName(organizationName);
        if(organization == null) {
            return null;
        }
        List<JobEntity> jobs = organization.getJobsInOrganization();
        jobs.add(job);
        organization.setJobsInOrganization(jobs);

        return organizationRepository.save(organization);
    }
}
