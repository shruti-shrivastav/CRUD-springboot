package com.shruti.em_app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements EmpService{
    List<Employee> emps = new ArrayList<>();

    @Override
    public String createemp(Employee emp) {
        emps.add(emp);
        return "Employee added successfully";
    }

    @Override
    public List<Employee> getemp() {
        return emps;
    }

    @Override
    public Employee updateemp(Employee emp) {
        // Implementation for updating employee
        return emp;
    }

    @Override
    public boolean deleteemp(int id) {
        emps.removeIf(emp -> emp.getId() == id);
        return true;
    }

}
