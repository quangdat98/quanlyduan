package com.example.quanlyduan.data.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "dbo_employee_solution")
public class EmployeeSolution {
    @Id
    private int id;


    private String username;
    private int solution_id;

    public EmployeeSolution(int id, String username, int solution_id) {
        this.id = id;
        this.username = username;
        this.solution_id = solution_id;
    }

    public EmployeeSolution() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getSolution_id() {
        return solution_id;
    }

    public void setSolution_id(int solution_id) {
        this.solution_id = solution_id;
    }
}
