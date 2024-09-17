package com.microservice.employee.employee.services.Impl;

import com.microservice.employee.employee.errors.EmployeeNotFoundException;
import com.microservice.employee.employee.models.Employee;
import com.microservice.employee.employee.models.Response;
import com.microservice.employee.employee.repos.EmployeeRepo;
import com.microservice.employee.employee.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public Response saveEmployee(Employee employee) {
        if (employee.getEmpId() == null){
            employee.setEmpId(UUID.randomUUID().toString());
        }
        Employee emp = employeeRepo.save(employee);
        return Response.builder()
                .statusCode(HttpStatus.CREATED)
                .message("Employee Created SuccessFully")
                .email(emp.getEmpMail())
                .build();

    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee getEmployee(String empId) {
        return employeeRepo.findById(empId).orElseThrow(
                    ()->new RuntimeException("Employee Does not exists - " + empId));
    }

    @Override
    public Employee deleteEmployeeById(String empId) {
        var emp = getEmployee(empId);
        employeeRepo.deleteById(empId);
        return emp;
    }
}
