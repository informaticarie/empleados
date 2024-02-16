package com.edy.empleados.Employee;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeServices employeeServices;


    @GetMapping("/all")
    public List<Employee> getEmployee(){
        return employeeServices.getEmployee();
    }

    @GetMapping("/id/{employeeId}")
    public Optional<Employee> getById(@PathVariable("employeeId") Integer employeeId ){
        return employeeServices.getEmployeebyId(employeeId);
    }


    @PostMapping("/add")
    public void addEmployee(@RequestBody Employee employee){

        employeeServices.addEmployee(employee);
    }



}
