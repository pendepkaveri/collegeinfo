package com.example.collegeinfo.controller;

import com.example.collegeinfo.model.Department;
import com.example.collegeinfo.service.Departmentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class Departmentcontroller {

    @Autowired
    private Departmentservice Departmentservice;

    @PostMapping("/")
    public ResponseEntity<Department> addDepartment(@RequestBody Department department) {
        return new ResponseEntity<>(Departmentservice.SaveDepartment(department), HttpStatus.CREATED);
    }

    @GetMapping("/")
    public List<Department> getAllDepartments() {
        return Departmentservice.findAllDepartments();
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable Long id) {
        return Departmentservice.findDepartmentById(id);
    }

    @GetMapping("/college/{collegeName}")
    public List<Department> getDepartmentsByCollegeName(@PathVariable String collegeName) {
        return Departmentservice.findDepartmentsByCollegeName(collegeName);
    }


}


