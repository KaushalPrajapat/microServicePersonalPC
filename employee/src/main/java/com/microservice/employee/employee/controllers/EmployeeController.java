package com.microservice.employee.employee.controllers;

import com.microservice.employee.employee.models.Employee;
import com.microservice.employee.employee.models.Response;
import com.microservice.employee.employee.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * EmployeeController
 */

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
  private EmployeeService employeeService;

  @PostMapping()
  public Response saveEmployee(@RequestBody Employee employee){
    return employeeService.saveEmployee(employee);
  }

  @GetMapping()
  public List<Employee> getEmployeeList(){
   return employeeService.getAllEmployee();
  }

  @GetMapping("/{empId}")
  public Employee getEmployee(@PathVariable String empId){
   return employeeService.getEmployee(empId);
  }

  @DeleteMapping("/{empId}")
 public Employee deleteById(@PathVariable String empId){
   return employeeService.deleteEmployeeById(empId);
  }
    
}