package com.example.collegeinfo.service;

import com.example.collegeinfo.Repository.Facultyrepo;
import com.example.collegeinfo.model.Faculty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facultyservice {

    @Autowired
    private Facultyrepo facultyRepository;

    public Faculty saveFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public List<Faculty> findAllFaculties() {
        return facultyRepository.findAll();
    }

    public List<Faculty> findFacultiesByDepartmentName(String departmentName) {
        return facultyRepository.findByDepartmentName(departmentName);
    }


}


