package com.jhon.application.entity;

import com.jhon.application.dtos.JobDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "candidate")
public class CandidateEntity {
    @Id
    private String _id;
    private String candidateName;
    private String candidateEmail;
    private String candidatePassword;
    private List<JobDTO> jobsApplied;

    public CandidateEntity() {
    }

    public CandidateEntity(String _id, String candidateName, String candidateEmail, String candidatePassword, List<JobDTO>  jobsApplied) {
        this._id = _id;
        this.candidateName = candidateName;
        this.candidateEmail = candidateEmail;
        this.candidatePassword = candidatePassword;
        this.jobsApplied = jobsApplied;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateEmail() {
        return candidateEmail;
    }

    public void setCandidateEmail(String candidateEmail) {
        this.candidateEmail = candidateEmail;
    }

    public String getCandidatePassword() {
        return candidatePassword;
    }

    public void setCandidatePassword(String candidatePassword) {
        this.candidatePassword = candidatePassword;
    }

    public List<JobDTO>  getJobsApplied() {
        return jobsApplied;
    }

    public void setJobsApplied(List<JobDTO> jobsApplied) {
        this.jobsApplied = jobsApplied;
    }
}
