package com.classexercisedwo.demo.springclass.models;

import javax.persistence.*;

@Entity
@Table(name= "companies")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @Column(name = "company_id")
    private String companyId;

    public Company(String companyId, String name) {
        this.companyId = companyId;
        Name = name;
    }

    public Company() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Column(name = "name")
    private String Name;



}
