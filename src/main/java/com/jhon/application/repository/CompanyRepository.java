package com.jhon.application.repository;

import com.jhon.application.entity.CompanyEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompanyRepository extends MongoRepository<CompanyEntity, String> {
   // CompanyEntity findBy_id(String id);
}