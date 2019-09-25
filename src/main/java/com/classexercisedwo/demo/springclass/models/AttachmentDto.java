package com.classexercisedwo.demo.springclass.models;

public class AttachmentDto {
    public AttachmentDto(Long companyId, Long studentId) {
        this.companyId = companyId;
        this.studentId = studentId;
    }

    private Long companyId;
    private  Long studentId;

    public AttachmentDto() {
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
}
