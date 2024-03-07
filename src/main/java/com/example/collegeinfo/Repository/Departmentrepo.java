package com.example.collegeinfo.Repository;

import com.example.collegeinfo.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Departmentrepo extends JpaRepository<Department, Long> {
    List<Department> findByCollegeName(String collegeName);
}
