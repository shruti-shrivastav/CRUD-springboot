package com.shruti.em_app;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface EmpService {
    String createemp(Employee emp);
    List<Employee> getemp();
    String updateemp(Integer id, Employee emp);
    boolean deleteemp(Integer id);
    Employee reademp(Integer id);
}
