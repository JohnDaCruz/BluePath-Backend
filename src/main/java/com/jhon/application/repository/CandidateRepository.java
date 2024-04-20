package com.jhon.application.repository;

import com.jhon.application.entity.CandidateEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CandidateRepository extends MongoRepository<CandidateEntity, Integer>{
}
