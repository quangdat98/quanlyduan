package com.example.quanlyduan.controllers;

import com.example.quanlyduan.data.model.Employee;
import com.example.quanlyduan.data.model.Solution;
import com.example.quanlyduan.data.service.EmployeeService;
import com.example.quanlyduan.data.service.SolutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
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
    public String getsolution(){
        return "redirect:/solution";
    }

    @GetMapping("/solution")
    public String home(Model model, HttpServletRequest request, RedirectAttributes redirect){
        request.getSession().setAttribute("listSolution",null);
        int number=0;
        if(request.getSession().getAttribute("pageNumberEdit") == null){
            number=1;
        }else{
            number = (int) request.getSession().getAttribute("pageNumberEdit");

        }
        System.out.println("day la ---------------"+number);
        return "redirect:/solution/page/"+number;
    }

    @GetMapping("/solution/page/{pageNumber}")
    public String showpage(HttpServletRequest request,@PathVariable int pageNumber,Model model){
        PagedListHolder<?> pages = (PagedListHolder<?>) request.getSession().getAttribute("listSolution");
        List<Solution> list =(List<Solution>) solutionService.findAllSoution();
        if(pages == null){
            pages =new PagedListHolder<>(list);
            pages.setPageSize(5);
        }else{
            final int goToPage = pageNumber - 1;
            if (goToPage <= pages.getPageCount() && goToPage >= 0) {
                pages.setPage(goToPage);
            }
        }
        request.getSession().setAttribute("listSolution", pages);
        request.getSession().setAttribute("pageNumber",pageNumber);
        int current = pages.getPage() + 1;
        int begin = Math.max(1, current - list.size());
        int end = Math.min(begin + 5, pages.getPageCount());
        int totalPageCount = pages.getPageCount();
        String baseUrl = "/solution/page/";

        model.addAttribute("beginIndex", begin);
        model.addAttribute("endIndex", end);
        model.addAttribute("currentIndex", current);
        model.addAttribute("totalPageCount", totalPageCount);
        model.addAttribute("baseUrl", baseUrl);
        model.addAttribute("solution", pages);
        return "home";
    }




    @RequestMapping("/delete/{id}")
    public String deleteSolution(Model model, @PathVariable int id){
        solutionService.deleteSolution(id);
        return "redirect:/solution";
    }

    //----------------------------- find id

    @RequestMapping("/findsolution/{pageNumber}")
    public String find(Model model, @RequestParam String name,HttpServletRequest request,@PathVariable int pageNumber){
        if(name.equals("")){
            return "redirect:/solution";
        }
        List<Solution> list = (List<Solution>) solutionService.findOne(name);
        if(list == null){
            return "redirect:/solution";
        }
        PagedListHolder<?> pages = (PagedListHolder<?>) request.getSession().getAttribute("listSolution");
        pages = new PagedListHolder<>(list);
        pages.setPageSize(5);

        final int goToPage = pageNumber - 1;
        if (goToPage <= pages.getPageCount() && goToPage >= 0) {
            pages.setPage(goToPage);
        }
        request.getSession().setAttribute("listSolution", pages);
        int current = pages.getPage() + 1;
        int begin = Math.max(1, current - list.size());
        int end = Math.min(begin + 5, pages.getPageCount());
        int totalPageCount = pages.getPageCount();
        String baseUrl = "/solution/page/";

        model.addAttribute("beginIndex", begin);
        model.addAttribute("endIndex", end);
        model.addAttribute("currentIndex", current);
        model.addAttribute("totalPageCount", totalPageCount);
        model.addAttribute("baseUrl", baseUrl);
        model.addAttribute("solution", pages);
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
        model.addAttribute("mess","thanh cong");
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
    public String edit(@ModelAttribute Solution solution,HttpServletRequest request){

        solutionService.saveSolution(solution);
        int pageNumber= (int) request.getSession().getAttribute("pageNumber");
        request.getSession().setAttribute("pageNumberEdit",pageNumber);
        System.out.println(pageNumber+" day la page");
        return "redirect:/solution";
    }

}

