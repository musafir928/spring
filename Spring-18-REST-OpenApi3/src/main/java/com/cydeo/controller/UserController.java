package com.cydeo.controller;

import com.cydeo.entity.User;
import com.cydeo.repository.UserRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@Tag(name = "User", description = "user controllers") // swagger
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    @Operation(summary = "read all users") // swagger
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successfully retrieved all users", content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "400", description = "bad request, something went wrong", content = @Content),
            @ApiResponse(responseCode = "404", description = "not found", content = @Content)
    }) // swagger
    public List<User> readAllUsers() {
        return userRepository.findAll();
    }

}
