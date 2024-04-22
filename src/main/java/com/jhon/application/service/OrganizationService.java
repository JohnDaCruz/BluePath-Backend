package com.jhon.application.service;

import com.jhon.application.entity.OrganizationEntity;
import com.jhon.application.repository.JobRepository;
import com.jhon.application.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;

    @Autowired
    private JobRepository jobRepository;

    public List<OrganizationEntity> getAllOrganizations() {
        return organizationRepository.findAll();
    }

    public OrganizationEntity createOrganization(OrganizationEntity organization) {
        return organizationRepository.save(organization);
    }

    public OrganizationEntity createAJobForOrganizationByName(OrganizationEntity organization) {

    }
}
