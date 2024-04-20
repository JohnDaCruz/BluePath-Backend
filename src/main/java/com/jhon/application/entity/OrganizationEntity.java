package com.jhon.application.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Document(collection = "organization")
public class OrganizationEntity {
    @MongoId
    private ObjectId _id;
    private int organizationId;
    private String organizationName;
    private String organizationEmail;
    private String organizationPassword;
    private List<JobEntity> organizationTopics;

    public OrganizationEntity(int organizationId, String organizationName, String organizationEmail, String organizationPassword, List<JobEntity> organizationTopics) {
        this.organizationId = organizationId;
        this.organizationName = organizationName;
        this.organizationEmail = organizationEmail;
        this.organizationPassword = organizationPassword;
        this.organizationTopics = organizationTopics;
    }

    public int getorganizationId() {
        return organizationId;
    }

    public void setorganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    public String getorganizationName() {
        return organizationName;
    }

    public void setorganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getorganizationEmail() {
        return organizationEmail;
    }

    public void setorganizationEmail(String organizationEmail) {
        this.organizationEmail = organizationEmail;
    }

    public String getorganizationPassword() {
        return organizationPassword;
    }

    public void setorganizationPassword(String organizationPassword) {
        this.organizationPassword = organizationPassword;
    }

    public List<JobEntity> getorganizationTopics() {
        return organizationTopics;
    }

    public void setorganizationTopics(List<JobEntity> organizationTopics) {
        this.organizationTopics = organizationTopics;
    }
}
