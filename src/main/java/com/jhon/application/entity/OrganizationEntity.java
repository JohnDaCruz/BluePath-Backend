package com.jhon.application.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "organization")
public class OrganizationEntity {
    @Id
    private String _id;
    private String organizationName;
    private String organizationEmail;
    private String organizationPassword;
    private List<JobEntity> jobsInOrganization;

    public OrganizationEntity(String _id, String organizationName, String organizationEmail, String organizationPassword, List<JobEntity> jobsInOrganization) {
        this._id = _id;
        this.organizationName = organizationName;
        this.organizationEmail = organizationEmail;
        this.organizationPassword = organizationPassword;
        this.jobsInOrganization = jobsInOrganization;
    }

    public OrganizationEntity() {

    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationEmail() {
        return organizationEmail;
    }

    public void setOrganizationEmail(String organizationEmail) {
        this.organizationEmail = organizationEmail;
    }

    public String getOrganizationPassword() {
        return organizationPassword;
    }

    public void setOrganizationPassword(String organizationPassword) {
        this.organizationPassword = organizationPassword;
    }

    public List<JobEntity> getJobsInOrganization() {
        return jobsInOrganization;
    }

    public void setJobsInOrganization(List<JobEntity> jobsInOrganization) {
        this.jobsInOrganization = jobsInOrganization;
    }
}
