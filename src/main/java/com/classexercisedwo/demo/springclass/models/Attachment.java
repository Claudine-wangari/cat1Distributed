package com.classexercisedwo.demo.springclass.models;

import javax.persistence.*;

@Entity
@Table(name="attachments")
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

//    @ManyToOne
//    @JoinColumn(name = "student_id")
//    private Student student;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    private String department;

    public Attachment(Company company, String department) {
        this.company = company;
        this.department = department;

    }

    private Boolean rejected = false;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Boolean getConfirmed() {
        return rejected;
    }

    public void setConfirmed(Boolean confirmed) {
        this.rejected = confirmed;
    }
}

