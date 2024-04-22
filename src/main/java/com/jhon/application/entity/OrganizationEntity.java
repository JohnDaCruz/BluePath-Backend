package com.jhon.application.entity;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Document(collection = "organization")
public class OrganizationEntity {
    @MongoId
    private ObjectId _id;
    private String organizationName;
    private String organizationEmail;
    private String organizationPassword;
    private ObjectId jobsID;

    public OrganizationEntity(
            ObjectId _id,
            String organizationName,
            String organizationEmail,
            String organizationPassword,
            ObjectId jobsID
    ) {
        this._id = _id;
        this.organizationName = organizationName;
        this.organizationEmail = organizationEmail;
        this.organizationPassword = organizationPassword;
        this.jobsID = jobsID;
    }

    public OrganizationEntity() {

    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
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

    public ObjectId getJobsID() {
        return jobsID;
    }

    public void setJobsID(ObjectId jobsID) {
        this.jobsID = jobsID;
    }
}
