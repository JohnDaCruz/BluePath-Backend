package com.jhon.application.repository;

import com.jhon.application.entity.JobEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobRepository extends MongoRepository<JobEntity, Integer> {
}
