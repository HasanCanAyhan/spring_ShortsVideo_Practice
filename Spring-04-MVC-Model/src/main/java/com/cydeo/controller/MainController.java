package com.cydeo.controller;


import com.cydeo.model.Employee;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @RequestMapping("/employees")
    public String empList(Model model){

        //database,api,random data generator
        //model.addAttribute("name","Mike");


        List<Employee> employeeList = new ArrayList<>();
        Faker faker = new Faker();
        employeeList.add(new Employee(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(50000,140000)));
        employeeList.add(new Employee(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(50000,140000)));
        employeeList.add(new Employee(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(50000,140000)));
        employeeList.add(new Employee(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(50000,140000)));

        model.addAttribute("employees", employeeList);

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
