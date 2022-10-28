package com.cydeo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    //15-MVC-QUERY(REQUEST)PARAMETER

    @RequestMapping("/new") // /employee/new?firstName=Joe
    public String getInfo(@RequestParam(required = false,defaultValue = "TEST") String firstName, Model model){

        System.out.println(firstName);
        model.addAttribute("fName", firstName);

        return "emp-register";
    }


}
