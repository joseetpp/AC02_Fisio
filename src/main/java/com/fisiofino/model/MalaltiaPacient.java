package com.fisiofino.model;

public class MalaltiaPacient {
    private int idDiagnosis;
    private int idPatient;
    private String dniPacient;
    private String nomPacient;
    private String cognomsPacient;
    private String code;
    private String name;
    private String status;
    private String treatment;

    public MalaltiaPacient() {
    }

    public MalaltiaPacient(String dniPacient, String code, String name, String status, String treatment) {
        this.dniPacient = dniPacient;
        this.code = code;
        this.name = name;
        this.status = status;
        this.treatment = treatment;
    }

    public int getIdDiagnosis() {
        return idDiagnosis;
    }

    public void setIdDiagnosis(int idDiagnosis) {
        this.idDiagnosis = idDiagnosis;
    }

    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

    public String getDniPacient() {
        return dniPacient;
    }

    public void setDniPacient(String dniPacient) {
        this.dniPacient = dniPacient;
    }

    public String getNomPacient() {
        return nomPacient;
    }

    public void setNomPacient(String nomPacient) {
        this.nomPacient = nomPacient;
    }

    public String getCognomsPacient() {
        return cognomsPacient;
    }

    public void setCognomsPacient(String cognomsPacient) {
        this.cognomsPacient = cognomsPacient;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    @Override
    public String toString() {
        return "MalaltiaPacient [dniPacient=" + dniPacient + ", code=" + code + ", name=" + name
                + ", status=" + status + ", treatment=" + treatment + "]";
    }
}