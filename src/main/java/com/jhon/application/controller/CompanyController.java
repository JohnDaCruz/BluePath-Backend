package com.jhon.application.controller;

import com.jhon.application.dtos.JobDTO;
import com.jhon.application.entity.CompanyEntity;
import com.jhon.application.entity.JobEntity;
import com.jhon.application.repository.CompanyRepository;
import com.jhon.application.service.CompanyService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/company")
public class CompanyController{

    @Autowired
    private CompanyService companyService;
    @Autowired
    private CompanyRepository companyRepository;

    @GetMapping("/get-companies")
    public ResponseEntity<Object> getAll() {
        List<CompanyEntity> listOrg = companyService.allCompanies();
        return ResponseEntity.status(HttpStatus.FOUND).body(listOrg.toArray());
    }

    @PostMapping("/create-company")
    public ResponseEntity<Object> createUser(@RequestBody CompanyEntity companyEntity) {
        var newOrgEntity = new CompanyEntity();
        BeanUtils.copyProperties(companyEntity, newOrgEntity);

        CompanyEntity companyCreated = companyService.createCompany(newOrgEntity);

        return ResponseEntity.status(HttpStatus.CREATED).body(companyCreated.getCompanyName() + " criado com sucesso!");
    }

    @PatchMapping("/create-vacancy/{companyId}")
    public ResponseEntity<Object> createJob(@RequestBody JobDTO jobDTO, @PathVariable String companyId ){
        var newJob = new JobEntity();
        BeanUtils.copyProperties(jobDTO, newJob);

        CompanyEntity newJobCompany = companyService.addJobToCompany(companyId,newJob);

        return ResponseEntity.status(HttpStatus.CREATED).body(newJobCompany);
    }

    @GetMapping("/teste/{companyId}")
    public ResponseEntity<Object> rotaTeste(@PathVariable String companyId){
        var companyExist = companyRepository.findById(companyId);
        if(companyExist.isPresent()){return ResponseEntity.status(HttpStatus.OK).body(companyExist.get());}
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not found!");
    }
}
