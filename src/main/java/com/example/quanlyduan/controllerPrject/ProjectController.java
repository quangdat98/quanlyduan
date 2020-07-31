package com.example.quanlyduan.controllerPrject;

import com.example.quanlyduan.data.model.EmployeeSolution;
import com.example.quanlyduan.data.service.EmployeeService;
import com.example.quanlyduan.data.service.ProjectService;
import com.example.quanlyduan.data.service.SolutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProjectController {
    private ProjectService projectService;
    private EmployeeService employeeService;
    private SolutionService solutionService;

    @Autowired
    public void setProjectService(ProjectService projectService) {
        this.projectService = projectService;
    }
    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @Autowired
    public void setSolutionService(SolutionService solutionService) {
        this.solutionService = solutionService;
    }

    @GetMapping("/project")
    public String getProject(Model model){
        model.addAttribute("list",projectService.list());
        return "project";
    }

    @GetMapping("/editproject/{id}")
    public String getOne(@PathVariable int id, Model model){
        model.addAttribute("project",projectService.findOneEmployeeSolution(id));
        model.addAttribute("employee",employeeService.findAllName());
        model.addAttribute("solution",solutionService.findAllSoution());
        return "editproject";
    }

    @PostMapping("/insert")
    public String insert(@ModelAttribute EmployeeSolution employeeSolution){
        projectService.save(employeeSolution);
        return "redirect:/project";
    }

    @GetMapping("/deleteproject/{id}")
    public String deleteproject(@PathVariable int id){
        projectService.deleteproject(id);
        return "redirect:/project";
    }
    @ResponseBody
    @GetMapping("/getidProject/{id}")
    public List<EmployeeSolution> getidProject(@PathVariable int id){
        System.out.println("da vao day");
        return projectService.findUserNameBySolutionId(id);
    }
}
