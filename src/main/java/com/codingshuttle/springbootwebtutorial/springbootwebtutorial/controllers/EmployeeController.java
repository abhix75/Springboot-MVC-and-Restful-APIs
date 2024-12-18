package com.codingshuttle.springbootwebtutorial.springbootwebtutorial.controllers;

import com.codingshuttle.springbootwebtutorial.springbootwebtutorial.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    @GetMapping(path = "/getSecretMessage")
    public String getMySuperSecretMessage(){
        return "Secret Message : ascdnvnsvmodcoj#dnkdj";
    }

    @GetMapping(path = "/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable(name = "employeeId") Long id){
        return new EmployeeDTO(id,"Abhijit","abhijitmishraak10@gmail.com",23,LocalDate.of(2025,06,25),true);
    }

    @GetMapping
    public String getAllEmployees(@RequestParam(required = false,name = "inputage") Integer age,
                                  @RequestParam(required = false) String sortBy){
        return "Hii age " + age + " " + sortBy;
    }

    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO inputEmployee){
        inputEmployee.setId(100L);
        return inputEmployee;
    }

    @PutMapping
    public  String  updateTheEmployee(){
        return "Hello from put";
    }





}
