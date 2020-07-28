package com.example.quanlyduan.controllerEmployee;

import com.example.quanlyduan.data.model.Employee;
import com.example.quanlyduan.data.model.Solution;
import com.example.quanlyduan.data.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping("/em")
    public String getEmployee(){
        return "redirect:/employee";
    }

    @GetMapping("/employee")
    public String home(Model model, HttpServletRequest request, RedirectAttributes redirect){
        request.getSession().setAttribute("listEmployee",null);
        int number=0;
        if(request.getSession().getAttribute("pageNumberEdit") == null){
            number=1;
        }else{
            number = (int) request.getSession().getAttribute("pageNumberEdit");

        }
        System.out.println("day la ---------------"+number);
        return "redirect:/employee/page/"+number;
    }

    @GetMapping("/employee/page/{pageNumber}")
    public String showpage(HttpServletRequest request, @PathVariable int pageNumber, Model model){
        PagedListHolder<?> pages = (PagedListHolder<?>) request.getSession().getAttribute("listEmployee");
        List<Employee> list =(List<Employee>) employeeService.findAllName();
        if(pages == null){
            pages =new PagedListHolder<>(list);
            pages.setPageSize(5);
        }else{
            final int goToPage = pageNumber - 1;
            if (goToPage <= pages.getPageCount() && goToPage >= 0) {
                pages.setPage(goToPage);
            }
        }
        request.getSession().setAttribute("listEmployee", pages);
        request.getSession().setAttribute("pageNumber",pageNumber);
        int current = pages.getPage() + 1;
        int begin = Math.max(1, current - list.size());
        int end = Math.min(begin + 5, pages.getPageCount());
        int totalPageCount = pages.getPageCount();
        String baseUrl = "/employee/page/";

        model.addAttribute("beginIndex", begin);
        model.addAttribute("endIndex", end);
        model.addAttribute("currentIndex", current);
        model.addAttribute("totalPageCount", totalPageCount);
        model.addAttribute("baseUrl", baseUrl);
        model.addAttribute("employee", pages);
        return "employee";
    }

    //-------------------------------Thêm mới

    @RequestMapping("/editemployee/{id}")
    public String app(@PathVariable int id,Model model){
        model.addAttribute("employee",employeeService.findOne(id));
        return "employeeEdit";
    }
    @PostMapping("/editEndelete")
    public String insert(@ModelAttribute Employee employee){
        employeeService.employee(employee);
        return "redirect:/em";
    }

    //---------------------delete
    @GetMapping("/deleteEm/{username}")
    public String deleteEm(@PathVariable String username,Model model){
        employeeService.deleteEm(username);
        return "redirect:/em";
    }

}
