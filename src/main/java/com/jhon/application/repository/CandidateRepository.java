package com.jhon.application.repository;

import com.jhon.application.entity.CandidateEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CandidateRepository extends MongoRepository<CandidateEntity, String>{
    CandidateEntity findByCandidateName(String candidateName);
    CandidateEntity findByCandidateId(String candidateId);
}
