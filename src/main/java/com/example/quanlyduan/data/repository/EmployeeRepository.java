package com.example.quanlyduan.data.repository;
import com.example.quanlyduan.data.model.Employee;
import com.example.quanlyduan.data.model.Solution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
