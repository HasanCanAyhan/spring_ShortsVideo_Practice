package com.cydeo.controller;


import com.cydeo.model.Employee;
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


    @RequestMapping("/employeeInfo")
    public String empInfo(Model model){

        //creating one object from employee class and assigning values
        Employee employee = new Employee("Can","John",130_000);
        //passing our object to model
        model.addAttribute("emp",employee);

        return "employee-info.html";
    }


}
