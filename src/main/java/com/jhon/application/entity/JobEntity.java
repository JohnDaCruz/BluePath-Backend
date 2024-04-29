package com.jhon.application.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
import java.util.List;

@Document(value = "job")
public class JobEntity {
    private String _id;
    private String hiringCompany;
    private String jobName;
    private String location;
    private String workModality;
    private Long salaryRange;
    private String benefits;
    private String businessArea;
    private boolean affirmativeVacancy;
    private Date publicationDate;
    @DBRef
    private CandidateEntity candidatesInJob;

    public JobEntity() {
    }

    public JobEntity(
            String _id,
            String jobName,
            String location,
            String workModality,
            Long salaryRange,
            String benefits,
            String businessArea,
            boolean affirmativeVacancy,
            Date publicationDate,
            String hiringCompany,
            CandidateEntity candidatesInJob
    ) {
        this._id = _id;
        this.jobName = jobName;
        this.location = location;
        this.workModality = workModality;
        this.salaryRange = salaryRange;
        this.benefits = benefits;
        this.businessArea = businessArea;
        this.affirmativeVacancy = affirmativeVacancy;
        this.publicationDate = publicationDate;
        this.hiringCompany = hiringCompany;
        this.candidatesInJob = candidatesInJob;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWorkModality() {
        return workModality;
    }

    public void setWorkModality(String workModality) {
        this.workModality = workModality;
    }

    public Long getSalaryRange() {
        return salaryRange;
    }

    public void setSalaryRange(Long salaryRange) {
        this.salaryRange = salaryRange;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getBusinessArea() {
        return businessArea;
    }

    public void setBusinessArea(String businessArea) {
        this.businessArea = businessArea;
    }

    public boolean isAffirmativeVacancy() {
        return affirmativeVacancy;
    }

    public void setAffirmativeVacancy(boolean affirmativeVacancy) {
        this.affirmativeVacancy = affirmativeVacancy;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getHiringCompany() {
        return hiringCompany;
    }

    public void setHiringCompany(String hiringCompany) {
        this.hiringCompany = hiringCompany;
    }

    public CandidateEntity getCandidatesInJob() {
        return candidatesInJob;
    }

    public void setCandidatesInJob(CandidateEntity candidatesInJob) {
        this.candidatesInJob = candidatesInJob;
    }
}
