package com.jhon.application.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
import java.util.List;

@Document(value = "job")
public class JobEntity {
    @Id
    private int _id;
    private String jobName;
    private String location;
    private String workModality;
    private Long salaryRange;
    private String benefits;
    private String businessArea;
    private boolean affirmativeVacancy;
    private Date publicationDate;
    private String hiringCompany;
    private List<ObjectId> candidatesInJob;

    public JobEntity() {
    }

    public JobEntity(int _id, String jobName, String location, String workModality, Long salaryRange, String benefits, String businessArea, boolean affirmativeVacancy, Date publicationDate, String hiringCompany, List<ObjectId> candidatesInJob) {
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

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
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

    public List<ObjectId> getCandidatesInJob() {
        return candidatesInJob;
    }

    public void setCandidatesInJob(List<ObjectId> candidatesInJob) {
        this.candidatesInJob = candidatesInJob;
    }
}
