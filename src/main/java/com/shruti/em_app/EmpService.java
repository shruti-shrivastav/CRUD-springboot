package com.shruti.em_app;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface EmpService {
    String createemp(Employee emp);
    List<Employee> getemp();
    Employee updateemp(Employee emp);
    boolean deleteemp(Integer id);
}
