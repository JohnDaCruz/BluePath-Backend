package com.jhon.application.repository;

import com.jhon.application.entity.OrganizationEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrganizationRepository extends MongoRepository<OrganizationEntity, ObjectId> {
}
