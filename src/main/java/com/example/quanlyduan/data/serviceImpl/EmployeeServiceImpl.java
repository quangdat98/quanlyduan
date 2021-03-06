package com.example.quanlyduan.data.serviceImpl;

import com.example.quanlyduan.data.model.Employee;
import com.example.quanlyduan.data.repository.EmployeeRepository;
import com.example.quanlyduan.data.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAllName() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findOne(String em) {
        return employeeRepository.findOne(em);
    }


    @Override
    public Employee employee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEm(String name) {
        employeeRepository.deleteEm(name);
    }


}
