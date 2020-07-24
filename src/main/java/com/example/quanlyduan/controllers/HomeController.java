package com.example.quanlyduan.controllers;

import com.example.quanlyduan.data.model.Employee;
import com.example.quanlyduan.data.service.EmployeeService;
import com.example.quanlyduan.data.service.SolutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    private EmployeeService employeeService;
    private SolutionService solutionService;

    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Autowired
    public void setSolutionService(SolutionService solutionService) {
        this.solutionService = solutionService;
    }

    @RequestMapping("/")
    public ModelAndView home(){
        ModelAndView model = new ModelAndView();
        model.addObject("listSolution",solutionService.findAllSoution());
        model.setViewName("home");
        return model;
    }
}

