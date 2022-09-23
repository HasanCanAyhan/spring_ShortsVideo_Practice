package com.cydeo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/employees")
    public String empList(Model model){

        //database,api,random data generator
        model.addAttribute("name","TEST");

        return "employee-list.html";
    }

}
