package com.example.quanlyduan.data.serviceImpl;

import com.example.quanlyduan.data.model.EmployeeSolution;
import com.example.quanlyduan.data.repository.ProjectRepository;
import com.example.quanlyduan.data.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    private ProjectRepository projectRepository;

    @Autowired
    public void setProjectRepository(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public List<EmployeeSolution> list() {
        return projectRepository.findAll();
    }

    @Override
    public EmployeeSolution findOneEmployeeSolution(int id) {
        return projectRepository.findOneEmployeeSolution(id);
    }

    @Override
    public EmployeeSolution save(EmployeeSolution employeeSolution) {
        return projectRepository.save(employeeSolution);
    }

    @Override
    public void deleteproject(int id) {
        projectRepository.deleteById(id);
    }

    @Override
    public List<EmployeeSolution> findUserNameBySolutionId(int id) {
        return (List<EmployeeSolution>) projectRepository.findUserNameBySolutionID(id);
    }

}
