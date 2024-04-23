package com.jhon.application.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Document(collection = "candidate")
public class CandidateEntity {
    @MongoId(FieldType.DOUBLE)
    private ObjectId _id;
    private String candidateName;
    private String candidateEmail;
    private String candidatePassword;
    private List<ObjectId> candidateJobs;

    public CandidateEntity() {
    }

    public CandidateEntity(ObjectId _id, String candidateName, String candidateEmail, String candidatePassword, List<ObjectId> candidateJobs) {
        this._id = _id;
        this.candidateName = candidateName;
        this.candidateEmail = candidateEmail;
        this.candidatePassword = candidatePassword;
        this.candidateJobs = candidateJobs;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
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

    public List<ObjectId> getCandidateJobs() {
        return candidateJobs;
    }

    public void setCandidateJobs(List<ObjectId> candidateJobs) {
        this.candidateJobs = candidateJobs;
    }
}
