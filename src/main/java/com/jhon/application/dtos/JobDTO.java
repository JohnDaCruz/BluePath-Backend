package com.jhon.application.dtos;

import com.jhon.application.entity.CandidateEntity;
import com.mongodb.lang.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Date;
import java.util.List;

public record JobDTO(
        String jobName,
        String location,
        String workModality,
        Long salaryRange,
        String benefits,
        String businessArea,
        boolean affirmativeVacancy,
        Date publicationDate,
        String hiringCompany,
        List<String> candidatesInJob
){ }
