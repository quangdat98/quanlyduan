package com.example.quanlyduan.data.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "dbo_solution")
public class Solution {
    @Id
    private int id;


    private String name;
    private boolean role_gem;
    private String regional;
    private String serve_industries;
    private String model;
    private String commercialized_status;
    private String primary_benefits;
    private String tech_stack;
    private String reference;
    private boolean status;
    private String duration_development;
    private String owner;

    public Solution() {
    }

    public Solution(int id, String name, boolean role_gem, String regional, String serve_industries, String model, String commercialized_status, String primary_benefits, String tech_stack, String reference, boolean status, String duration_development, String owner) {
        this.id = id;
        this.name = name;
        this.role_gem = role_gem;
        this.regional = regional;
        this.serve_industries = serve_industries;
        this.model = model;
        this.commercialized_status = commercialized_status;
        this.primary_benefits = primary_benefits;
        this.tech_stack = tech_stack;
        this.reference = reference;
        this.status = status;
        this.duration_development = duration_development;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRole_gem() {
        return role_gem;
    }

    public void setRole_gem(boolean role_gem) {
        this.role_gem = role_gem;
    }

    public String getRegional() {
        return regional;
    }

    public void setRegional(String regional) {
        this.regional = regional;
    }

    public String getServe_industries() {
        return serve_industries;
    }

    public void setServe_industries(String serve_industries) {
        this.serve_industries = serve_industries;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCommercialized_status() {
        return commercialized_status;
    }

    public void setCommercialized_status(String commercialized_status) {
        this.commercialized_status = commercialized_status;
    }

    public String getPrimary_benefits() {
        return primary_benefits;
    }

    public void setPrimary_benefits(String primary_benefits) {
        this.primary_benefits = primary_benefits;
    }

    public String getTech_stack() {
        return tech_stack;
    }

    public void setTech_stack(String tech_stack) {
        this.tech_stack = tech_stack;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDuration_development() {
        return duration_development;
    }

    public void setDuration_development(String duration_development) {
        this.duration_development = duration_development;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
