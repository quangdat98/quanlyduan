package com.example.quanlyduan.controllers;

import com.example.quanlyduan.data.model.Employee;
import com.example.quanlyduan.data.model.Solution;
import com.example.quanlyduan.data.service.EmployeeService;
import com.example.quanlyduan.data.service.SolutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
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
        List<Solution> solutionList = solutionService.findAllSoution();
        model.addObject("listSolution",solutionService.findAllSoution());
        model.setViewName("home");
        return model;
    }

    @RequestMapping("/delete/{id}")
    public String deleteSolution(Model model, @PathVariable int id){
        solutionService.deleteSolution(id);
        model.addAttribute("listSolution",solutionService.findAllSoution());
        return "home";
    }

    //----------------------------- find id

    @RequestMapping("/findsolution")
    public String find(Model model, @RequestParam String name){
        model.addAttribute("listSolution",solutionService.findOne(name));
        return "home";
    }

    //----------------------------- insert new

    @RequestMapping("/newsolution")
    public String insertNew(Model model){
        model.addAttribute("solution",new Solution());
        model.addAttribute("nameempl",employeeService.findAllName());

        return "newsolution";
    }
    @PostMapping("/insertnew")
    public String insertnews(@ModelAttribute Solution solution,Model model){
        solutionService.saveSolution(solution);
        return "redirect:/";
    }

    //----------------------------- edit

    @RequestMapping("/edit/{id}")
    public String getedit(@PathVariable int id,Model model){
        model.addAttribute("solutionOne",solutionService.findOneById(id));
        model.addAttribute("nameempl",employeeService.findAllName());
        return "editsolution";
    }
    @PostMapping("/edit")
    public String edit(@ModelAttribute Solution solution){
        solutionService.saveSolution(solution);
        return "redirect:/";
    }

}

