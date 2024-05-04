package com.jhon.application.controller;

import com.jhon.application.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/job")
public class JobController{

    @Autowired
    JobRepository jobRepository;

    @GetMapping("/all-jobs")
    public ResponseEntity getAllJobs(){
        return ResponseEntity.ok(jobRepository.findAll());
    }
}
