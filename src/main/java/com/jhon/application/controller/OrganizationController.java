package com.jhon.application.controller;

import com.jhon.application.dtos.JobDTO;
import com.jhon.application.dtos.OrganizationDTO;
import com.jhon.application.entity.JobEntity;
import com.jhon.application.entity.OrganizationEntity;
import com.jhon.application.entity.UserEntitySB;
import com.jhon.application.repository.OrganizationRepository;
import com.jhon.application.service.OrganizationService;
import org.bson.Document;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/organization")
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;


    @PostMapping("/hello")
    public ResponseEntity testRouter(@RequestBody UserEntitySB body) {
        Document user = new Document();
        user.append("name", body.getName());
        user.append("password", body.getPassword());
        return ResponseEntity.status(HttpStatus.FOUND).body("Request Body -> " + user.toJson());
    }

    @GetMapping("/get-organizations")
    public ResponseEntity getAll() {
        List<OrganizationEntity> listOrg = organizationService.getAllOrganizations();
        return ResponseEntity.status(HttpStatus.FOUND).body(listOrg.toArray());
    }

    @PostMapping("/create-organization")
    public ResponseEntity createUser(@RequestBody @Validated OrganizationDTO organizationDTO) {

        var newOrgEntity = new OrganizationEntity();
        BeanUtils.copyProperties(organizationDTO, newOrgEntity);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Organização criada com sucesso! \n " + organizationService.createOrganization(newOrgEntity));
    }

    @PatchMapping("/create-vacancy/{organization}")
    public ResponseEntity createJob(
            @PathVariable String organization,
            @RequestBody @Validated JobDTO jobDTO
    ) {
        var newJobEntity = new JobEntity();
        BeanUtils.copyProperties(jobDTO, newJobEntity);

        OrganizationEntity jobAdd = organizationService.addJobToOrganization(organization, newJobEntity);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Job add in your Organization -> " + jobAdd.toString());
    }

    @GetMapping("/teste")
    public List<JobEntity> rotaTeste(){
        return organizationService.jobAppliedReturn();
    }
}
