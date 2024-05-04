package com.jhon.application.dtos;

import com.jhon.application.entity.CandidateEntity;
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
        String hiringCompany
        //List<CandidateEntity> candidatesInJob
){
    public JobDTO {
    }
}
