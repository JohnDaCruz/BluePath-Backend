package com.jhon.application.entity;

import com.jhon.application.enums.JobModalities;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Date;


@Document(value = "job")
public class JobEntity {
    @Id
    private int idJob;
    private String jobName;
    private String localizacao;
    private JobModalities modalidadeTrabalho;
    private Long faixaSalarial;
    private String beneficios;
    private String areaAtuacao;
    private boolean vagaAfirmativa;
    private Date dataPublicacao;
    private String empresaContratante;
    private CandidateEntity[] candidatesInJob;

    public JobEntity(int idJob, String jobName, String localizacao, JobModalities modalidadeTrabalho, Long faixaSalarial, String beneficios, String areaAtuacao, boolean vagaAfirmativa, Date dataPublicacao, String empresaContratante, CandidateEntity[] candidatesInJob) {
        this.idJob = idJob;
        this.jobName = jobName;
        this.localizacao = localizacao;
        this.modalidadeTrabalho = modalidadeTrabalho;
        this.faixaSalarial = faixaSalarial;
        this.beneficios = beneficios;
        this.areaAtuacao = areaAtuacao;
        this.vagaAfirmativa = vagaAfirmativa;
        this.dataPublicacao = dataPublicacao;
        this.empresaContratante = empresaContratante;
        this.candidatesInJob = candidatesInJob;
    }

    public int getIdJob() {
        return idJob;
    }

    public void setIdJob(int idJob) {
        this.idJob = idJob;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public JobModalities getModalidadeTrabalho() {
        return modalidadeTrabalho;
    }

    public void setModalidadeTrabalho(JobModalities modalidadeTrabalho) {
        this.modalidadeTrabalho = modalidadeTrabalho;
    }

    public Long getFaixaSalarial() {
        return faixaSalarial;
    }

    public void setFaixaSalarial(Long faixaSalarial) {
        this.faixaSalarial = faixaSalarial;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public boolean isVagaAfirmativa() {
        return vagaAfirmativa;
    }

    public void setVagaAfirmativa(boolean vagaAfirmativa) {
        this.vagaAfirmativa = vagaAfirmativa;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getEmpresaContratante() {
        return empresaContratante;
    }

    public void setEmpresaContratante(String empresaContratante) {
        this.empresaContratante = empresaContratante;
    }

    public CandidateEntity[] getCandidatesInJob() {
        return candidatesInJob;
    }

    public void setCandidatesInJob(CandidateEntity[] candidatesInJob) {
        this.candidatesInJob = candidatesInJob;
    }
}
