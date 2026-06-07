package com.shruti.em_app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    // List<Employee> emps = new ArrayList<>();
    @Autowired // to inject the dependency of EmployeeService class - Dependency injection
    EmpService employeeService;
    @GetMapping("/emp")
    public List<Employee> show(){
        return employeeService.getemp();
    }

    @PostMapping("/emp")
    public String add(@RequestBody Employee emp){
        return employeeService.createemp(emp);        
    }

    @PatchMapping("/emp")
    public Employee update(@RequestBody Employee emp){
        return employeeService.updateemp(emp);
    }

    @DeleteMapping("/emp/{id}")
    public boolean delete(@PathVariable int id){
        return employeeService.deleteemp(id);
    }
}
