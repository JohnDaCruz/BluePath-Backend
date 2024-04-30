package com.jhon.application.service;

import com.jhon.application.entity.JobEntity;
import com.jhon.application.entity.CompanyEntity;
import com.jhon.application.repository.CompanyRepository;
import com.jhon.application.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService{

    @Autowired
    CompanyRepository companyRepository;
    @Autowired
    private JobRepository jobRepository;

    public List<CompanyEntity> allCompanies() {
        return companyRepository.findAll();
    }

    public CompanyEntity createCompany(CompanyEntity organization) {return companyRepository.save(organization);}

    public CompanyEntity addJobToCompany(String companyId, JobEntity job) {
        var companyOptional = companyRepository.findById(companyId);
        if (companyOptional.isPresent()) {
            var company = companyOptional.get();
            var companyName = company.getCompanyName();

            job.setHiringCompany(companyName);
            jobRepository.save(job);

            List<JobEntity> jobCompanyConverter = company.getJobsInCompany();

            if (jobCompanyConverter == null) {
                jobCompanyConverter = new ArrayList<>();
            }

            jobCompanyConverter.add(job);
            company.setJobsInCompany(jobCompanyConverter);

            return companyRepository.save(company);
        }
        return null;
    }

}
