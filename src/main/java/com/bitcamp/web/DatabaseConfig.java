package com.bitcamp.web;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.h2.server.web.WebServlet;

/**
 * DatabaseConfig
 */
@Configuration
public class DatabaseConfig {

    @Bean //컨피그 설정은 빈으로 한다
    public ServletRegistrationBean h2servletRegistration() {
        ServletRegistrationBean registration = new ServletRegistrationBean<>(new WebServlet());
        registration.addUrlMappings("/console/*");
        return registration;
    }
}