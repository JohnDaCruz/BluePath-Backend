package com.jhon.application.dtos;

import com.jhon.application.entity.JobEntity;

import java.util.List;

public record CompanyDTO(
        String companyName,
        List<JobEntity> jobsInCompany
) {}
