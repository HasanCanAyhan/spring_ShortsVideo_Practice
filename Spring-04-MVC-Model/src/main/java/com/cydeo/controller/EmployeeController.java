package com.cydeo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    //Lesson 15-MVC-QUERY(REQUEST)PARAMETER

    @RequestMapping("/new") // /employee/new?firstName=Joe
    public String getInfo(@RequestParam(required = false,defaultValue = "TEST") String firstName, Model model){

        System.out.println(firstName);
        model.addAttribute("fName", firstName);

        return "emp-register";
    }

    //Lesson 16-MVC-Path Parameter

    @RequestMapping("/add/{firstName}/{lastName}") // /employee/add/firstName
    public String getInfo2(@PathVariable String firstName,@PathVariable String lastName ,Model model){

        model.addAttribute("fName", firstName);
        model.addAttribute("lName", lastName);
        return "emp-register";
    }


}
