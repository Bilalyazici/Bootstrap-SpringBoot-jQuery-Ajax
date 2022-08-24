package com.example.ajax.Ajax.controller;

import com.example.ajax.Ajax.entity.Employee;
import com.example.ajax.Ajax.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "*")
@Controller
public class EmployeeController {
    @Autowired
    EmployeeRepo employeeRepo;

    @GetMapping("addEmployee/{userName}/{userLastName}")
    public Employee addEmployee(@PathVariable(value = "userName")String userName,
                         @PathVariable(value = "userLastName")String userLastName) {
        Employee employee = new Employee();
        employee.setUserName(userName);
        employee.setUserLastname(userLastName);
        return employeeRepo.save(employee);
    }

    @GetMapping("/getAll")
    public List<Employee> getAllEmployees(){
        return employeeRepo.findAll();
    }

}
