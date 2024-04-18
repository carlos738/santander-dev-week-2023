package c.santander.dev.week3.controller;

import c.santander.dev.week3.controller.Dto.UserDto;
import c.santander.dev.week3.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping("/users")
@Tag(name = "Users Controller",description = "RESTful API for managing users.")
public record UserController(UserService userService) {
    @GetMapping
    @Operation(summary = "Get all users",description = "Retrieve list of all registered users")
    @ApiResponse(Value={
            @ApiResponse(responseCode = "200",description = "Operation successful")
    })
    public ResponseEntity<List<UserDto>> findAll(){
        var users = userService.findAll();
        var usersDto = users.stream().map(UserDto::new).collect(Collectors.toList());
        //return ResponseEntity.of(usersDto);
        return ResponseEntity.of(Optional.of(usersDto));
    }

}



