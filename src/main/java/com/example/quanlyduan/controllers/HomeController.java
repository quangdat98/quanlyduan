package com.example.quanlyduan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @ResponseBody
    @RequestMapping("/")
    public String home(){
        return "ok";
    }
}
