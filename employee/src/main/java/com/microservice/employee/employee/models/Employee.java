package com.microservice.employee.employee.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

/**
 * Employee
 */

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    @Id
    private String empId;
    private String firstName;
    private String lastName;
    private String empMail;
    private String department;
}