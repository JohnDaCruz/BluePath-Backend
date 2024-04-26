package com.jhon.application.dtos;

import com.mongodb.lang.NonNull;
import org.bson.types.ObjectId;

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
        List<ObjectId> candidatesInJob
){ }
