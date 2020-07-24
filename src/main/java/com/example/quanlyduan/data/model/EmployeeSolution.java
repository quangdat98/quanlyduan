package com.example.quanlyduan.data.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "dbo_employee_solution")
public class EmployeeSolution {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    private int employee_id;
    private int solution_id;

    public EmployeeSolution() {
    }

    public EmployeeSolution(int id, int employee_id, int solution_id) {
        this.id = id;
        this.employee_id = employee_id;
        this.solution_id = solution_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public int getSolution_id() {
        return solution_id;
    }

    public void setSolution_id(int solution_id) {
        this.solution_id = solution_id;
    }
}
