package com.springapp.springboot.spring_course_springboot.services;

import com.springapp.springboot.spring_course_springboot.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmployee(int id);
    public void deleteEmployee(int id);
}
