package com.example.collegeinfo.controller;

import com.example.collegeinfo.model.College;
import com.example.collegeinfo.service.Collegeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/colleges")
public class Collegecontroller {

    @Autowired
    private Collegeservice collegeService;

    @PostMapping("/")
    public ResponseEntity<College> addCollege(@RequestBody College college) {
        return new ResponseEntity<>(collegeService.saveCollege(college), HttpStatus.CREATED);
    }

    @GetMapping("/")
    public List<College> getAllColleges() {
        return collegeService.findAllColleges();
    }

    @GetMapping("/{id}")
    public College getCollegeById(@PathVariable Long id) {
        return collegeService.findCollegeById(id);
    }

    @PutMapping("/{id}")
    public College updateCollege(@PathVariable Long id, @RequestBody College college) {
        // Here you would call the service to update the college, omitted for brevity
        return new College(); // Placeholder
    }

    @DeleteMapping("/{id}")
    public void deleteCollege(@PathVariable Long id) {
        collegeService.deleteCollegeById(id);
    }


}
