package com.example.controller;

import com.example.client.EmployeeClient;
import com.example.client.UserClient;
import com.example.dto.ResponseWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Consume_FeignClient {
    private final UserClient userClient;
    private final EmployeeClient employeeClient;

    public Consume_FeignClient(UserClient userClient, EmployeeClient employeeClient) {
        this.userClient = userClient;
        this.employeeClient = employeeClient;
    }

    @GetMapping("/api/v4/users")
    public ResponseEntity<ResponseWrapper> getUsers() {
        return ResponseEntity.ok(new ResponseWrapper("UserList retrieved", userClient.getUsers()));
    }

    @GetMapping("/api/v4/employee")
    public ResponseEntity<ResponseWrapper> getEmployee() {
        return ResponseEntity.ok(new ResponseWrapper("Successful", employeeClient.getEmployee("6298ebfecd0551211fce37a6")));
    }


}
