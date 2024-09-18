package com.microservice.employee.employee.configs;

import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.favorParameter(true)
                .parameterName("mediaType")
                .mediaType("xml", MediaType.APPLICATION_XML)
                .mediaType("json",MediaType.APPLICATION_JSON)

                .defaultContentType(MediaType.APPLICATION_JSON);
    }
}
