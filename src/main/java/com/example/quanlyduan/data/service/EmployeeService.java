package com.example.quanlyduan.data.service;

import com.example.quanlyduan.data.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAllName();

    Employee findOne(int em);

    Employee employee(Employee employee);
}
