package com.microservice.employee.employee.services;


import com.microservice.employee.employee.models.Employee;
import com.microservice.employee.employee.models.Response;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public Response saveEmployee(Employee employee);

    List<Employee> getAllEmployee();

    Employee getEmployee(String empId);

    Employee deleteEmployeeById(String empId);
}
