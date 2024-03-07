package com.example.collegeinfo.Repository;

import com.example.collegeinfo.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Facultyrepo extends JpaRepository<Faculty, Long> {
    List<Faculty> findByDepartmentName(String departmentName);
}
