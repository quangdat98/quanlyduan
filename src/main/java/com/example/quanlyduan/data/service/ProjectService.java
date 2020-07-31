package com.example.quanlyduan.data.service;


import com.example.quanlyduan.data.model.EmployeeSolution;

import java.util.List;

public interface ProjectService {
    List<EmployeeSolution> list();

    EmployeeSolution findOneEmployeeSolution(int id);

    EmployeeSolution save(EmployeeSolution employeeSolution);
    public void deleteproject(int id);



    List<EmployeeSolution> findUserNameBySolutionId(int id);
}
