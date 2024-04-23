package com.jhon.application.dtos;

import com.jhon.application.entity.JobEntity;
import com.mongodb.lang.NonNull;

import java.util.List;

public record OrganizationDTO(
        @NonNull String organizationName,
        String organizationEmail,
        String organizationPassword,
        List<JobEntity> jobsInOrganization
) {}
