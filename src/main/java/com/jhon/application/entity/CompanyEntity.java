package com.jhon.application.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "company")
public class CompanyEntity{
    @Id
    private String _id;
    private String companyName;
    private String companyEmail;
    private String companyPassword;
    @DBRef
    private List<JobEntity> jobsInCompany;

    public CompanyEntity(String _id, String companyName, String companyEmail, String companyPassword, List<JobEntity> jobsInCompany) {
        this._id = _id;
        this.companyName = companyName;
        this.companyEmail = companyEmail;
        this.companyPassword = companyPassword;
        this.jobsInCompany = jobsInCompany;
    }

    public CompanyEntity() {}

    public String get_id() {return _id;}

    public void set_id(String _id) {this._id = _id;}

    public String getCompanyName() {return companyName;}

    public void setCompanyName(String companyName) {this.companyName = companyName;}

    public String getCompanyEmail() {return companyEmail;}

    public void setCompanyEmail(String companyEmail) {this.companyEmail = companyEmail;}

    public String getCompanyPassword() {return companyPassword;}

    public void setCompanyPassword(String companyPassword) {this.companyPassword = companyPassword;}

    public List<JobEntity> getJobsInCompany() {return jobsInCompany;}

    public void setJobsInCompany(List<JobEntity> jobsInCompany) {this.jobsInCompany = jobsInCompany;}
}
