package com.edy.empleados.Employee;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeServices {

    private final EmployeeRepository employeeRepository;

    public List<Employee> getEmployee(){
        
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeebyId(Integer id){
        
        return employeeRepository.findById(id);
    }

    public void addEmployee(Employee employee)
    {
        employeeRepository.save(employee);
    }

}
