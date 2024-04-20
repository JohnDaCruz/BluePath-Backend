package com.jhon.application.service;

import com.jhon.application.entity.CandidateEntity;
import com.jhon.application.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;

    public List<CandidateEntity> findAllCandidates() {
        return candidateRepository.findAll();
    }

}
