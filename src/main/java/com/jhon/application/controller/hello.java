package com.jhon.application.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.jhon.application.entity.OrganizationEntity;
import com.jhon.application.service.CandidateService;
import com.jhon.application.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/hello",produces = "application/json")
public class hello {

    @Autowired
    private CandidateService candidateService;

    @Autowired
    private OrganizationService organizationService;

    @PostMapping
    public List<OrganizationEntity> hello(@RequestBody String name) {
        List<OrganizationEntity> listOrg = organizationService.getAllOrganizations();
        return listOrg;
    }
}
