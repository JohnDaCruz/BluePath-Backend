package com.jhon.application.controller;

import com.jhon.application.entity.CandidateEntity;
import com.jhon.application.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @PostMapping("/allCandidates")
    public ResponseEntity AllCandidates() {
        var allCandidates = candidateService.getAllCandidates();
        return ResponseEntity.status(HttpStatus.OK).body(allCandidates);
    }

    @PostMapping("/create-candidate")
    public ResponseEntity createCandidate(@RequestBody CandidateEntity body) {
        var userCreated = candidateService.createCandidate(body);
        return ResponseEntity.status(HttpStatus.CREATED).body("Usuário criado: " + userCreated);
    }
}
