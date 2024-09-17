package com.microservice.employee.employee.models;

import lombok.*;
import org.springframework.http.HttpStatusCode;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Response {
    private HttpStatusCode statusCode;
    private String message;
    private String email;
    private String comment;
}
