package com.shruti.em_app;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements EmpService{
    //List<Employee> emps = new ArrayList<>();

    @Autowired
    private EmployeeRepository empRepo;

    @Override
    public String createemp(Employee emp) {
        empRepo.save(emp);
        // emps.add(emp);
        return "Employee added successfully";
    }

    @Override
    public List<Employee> getemp() {
        return empRepo.findAll();
    }

    @Override
    public Employee updateemp(Employee emp) {
        // Implementation for updating employee
        return empRepo.save(emp);
    }

    @Override
    public boolean deleteemp(Integer id) {
        //emps.removeIf(emp -> emp.getId() == id);
        if(empRepo.existsById(id)){
            empRepo.deleteById(id);
            return true;
        }
        return false;
    }

}
