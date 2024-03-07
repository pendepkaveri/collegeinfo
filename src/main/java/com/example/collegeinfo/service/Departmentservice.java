package com.example.collegeinfo.service;

import com.example.collegeinfo.Repository.Departmentrepo;
import com.example.collegeinfo.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Departmentservice {
    private final Departmentrepo departmentRepository;

    @Autowired
    public Departmentservice(Departmentrepo departmentRepository) {
        this.departmentRepository = departmentRepository;
    }


    public Department SaveDepartment(Department department) {
        return department;
    }

    public List<Department> findAllDepartments() {
        return null;
    }

    public Department findDepartmentById(Long id) {
        return null;
    }

    public List<Department> findDepartmentsByCollegeName(String collegeName) {
        return null;
    }
}
