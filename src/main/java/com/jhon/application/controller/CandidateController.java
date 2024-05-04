package com.jhon.application.controller;

import com.jhon.application.dtos.CandidateDTO;
import com.jhon.application.entity.CandidateEntity;
import com.jhon.application.service.CandidateService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @GetMapping("/all-candidates")
    public ResponseEntity<Object> AllCandidates() {
        var allCandidates = candidateService.getAllCandidates();
        return ResponseEntity.status(HttpStatus.OK).body(allCandidates);
    }

    @PostMapping("/create-candidate")
    public ResponseEntity<Object> createCandidate(@RequestBody CandidateDTO candidateDTO) {
        var newCandidate = new CandidateEntity();
        BeanUtils.copyProperties(candidateDTO, newCandidate);

        var userCreated = candidateService.createCandidate(newCandidate);

        return ResponseEntity.status(HttpStatus.CREATED).body("Usuário criado: " + userCreated);
    }

    @PatchMapping("/apply-for-job/{jobId}/{candidateId}")
    public ResponseEntity<Object> applyForJob(@PathVariable String candidateId, @PathVariable String jobId) {
        var jobApply = candidateService.jobApply(candidateId, jobId);

        return ResponseEntity.status(HttpStatus.OK).body("Você aplicou para uma vaga!\n" + jobApply );
    }
}
