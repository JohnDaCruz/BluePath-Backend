package com.jhon.application.dtos;

import com.jhon.application.entity.JobEntity;
import com.mongodb.lang.NonNull;

import java.util.List;

public record OrganizationDTO(
        String organizationName,
        List<JobEntity> jobsInOrganization
) {}
