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
    public String updateemp(Integer id, Employee emp) {
        // Implementation for updating employee
        Employee newEmp = new Employee();
        newEmp.setId(id);
        newEmp.setName(emp.getName());
        newEmp.setEmail(emp.getEmail());
        newEmp.setDesignation(emp.getDesignation());
        empRepo.save(newEmp);
        return "Employee updated successfully";
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

    @Override
    public Employee reademp(Integer id){
        Employee emp = empRepo.findById(id).get(); // can use .orElse(null) as well 
                                        // to avoid NoSuchElementException if id is not found
        return emp;
    }

}
