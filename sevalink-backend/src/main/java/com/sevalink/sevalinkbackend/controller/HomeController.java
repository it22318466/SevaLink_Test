package com.sevalink.sevalinkbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/")
    public Map<String, Object> home() {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Welcome to SevaLink Backend API");
        response.put("status", "API is running ✅");
        response.put("version", "1.0.0");
        response.put("availableEndpoints", new HashMap<String, String>() {{
            put("Test Users", "http://localhost:8080/api/test-users");
            put("Users", "http://localhost:8080/api/users");
            put("Workers", "http://localhost:8080/api/workers");
            put("Search", "http://localhost:8080/api/search");
            put("Quotations", "http://localhost:8080/api/quotations");
            put("Job Posts", "http://localhost:8080/api/jobs");
        }});
        return response;
    }

    @GetMapping({"/api", "/api/"})
    public Map<String, Object> apiRoot() {
        return home();
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "healthy");
        response.put("service", "SevaLink Backend");
        return response;
    }
}
