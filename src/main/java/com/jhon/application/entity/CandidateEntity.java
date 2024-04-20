package com.jhon.application.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Document(collection = "candidate")
public class CandidateEntity {
    @Id
    private int organizationId;
    private String organizationName;
    private String organizationEmail;
    private String organizationPassword;
    private List<JobEntity> organizationTopics;

    public CandidateEntity(int organizationId, String organizationName, String organizationEmail, String organizationPassword, List<JobEntity> organizationTopics) {
        this.organizationId = organizationId;
        this.organizationName = organizationName;
        this.organizationEmail = organizationEmail;
        this.organizationPassword = organizationPassword;
        this.organizationTopics = organizationTopics;
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
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

    public List<JobEntity> getOrganizationTopics() {
        return organizationTopics;
    }

    public void setOrganizationTopics(List<JobEntity> organizationTopics) {
        this.organizationTopics = organizationTopics;
    }


}
