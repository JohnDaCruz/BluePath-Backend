package com.jhon.application.controller;

import com.jhon.application.dtos.CandidateDTO;
import com.jhon.application.dtos.JobDTO;
import com.jhon.application.dtos.OrganizationDTO;
import com.jhon.application.entity.CandidateEntity;
import com.jhon.application.entity.JobEntity;
import com.jhon.application.entity.OrganizationEntity;
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
    public ResponseEntity AllCandidates() {
        var allCandidates = candidateService.getAllCandidates();
        return ResponseEntity.status(HttpStatus.OK).body(allCandidates);
    }

    @PostMapping("/create-candidate")
    public ResponseEntity createCandidate(@RequestBody CandidateDTO candidateDTO) {
        var newCandidate = new CandidateEntity();
        BeanUtils.copyProperties(candidateDTO, newCandidate);
        var userCreated = candidateService.createCandidate(newCandidate);
        return ResponseEntity.status(HttpStatus.CREATED).body("Usuário criado: " + userCreated);
    }

    @PatchMapping("/apply-for-job/{candidateId}/{jobName}")
    public ResponseEntity applyForJob(
            @PathVariable String candidateId,
            @PathVariable String jobName,
            @RequestBody OrganizationDTO organizationDTO
    ) {
        //MANIPULAR DUAS COLLECTIONS COM UMA REQUISIÇÃO
        //MODIFICAR COLLECTION CANDIDATE ADICIOANDO JOB
        //VERIFICAR SE O JOB PERTENCE A ALGUMA ORGANIZATION
        //PERSISTIR NA COLLECTION DA ORGANIZATION TAMBÉM - REQ. CANDIDATE ENTITY & JOB ENTITY
        var newJobForCandidate = candidateService.jobApply(organizationDTO, candidateId, jobName);
        return ResponseEntity.status(HttpStatus.OK).body(newJobForCandidate);
    }
}
